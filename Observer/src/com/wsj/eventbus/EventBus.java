package com.wsj.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventBus {
	private static EventBus eventBus;
	private HashMap<String,List<EventListener>> mListenerMap;
	public static EventBus getInstance(){
		if(eventBus==null)
			eventBus = new EventBus();
		return eventBus;
	}
	
	private EventBus(){
		mListenerMap = new HashMap<>();
	}
	
	public void regist(Object obj){
		 Class targetClass = obj.getClass();

		for (Method m : targetClass.getMethods()) {
			if ((m.getAnnotation(SubScribe.class))!=null) {
				Class<?>[] paramType = m.getParameterTypes();
				if(paramType.length<1)return;
				String eventType = paramType[0].toString();
				List<EventListener> list = mListenerMap.get(eventType);
				if(list==null){
					list = new ArrayList<>();
					mListenerMap.put(eventType,list);
				}
				list.add(new EventListener(m, obj));
				
			} else {
				
			}
		}
	}
	
	public void unRegist(Object obj){
//		 mListenerMap.forEach();
	}
	
	public void post(Object event){
		String className = event.getClass().toString();
		List<EventListener> list = mListenerMap.get(className);
		if(list==null)return;
		list.forEach(listener->listener.invoke(event));
	}
	
	
	static class EventListener{
		Method method;
		Object object;
		public EventListener(Method method,Object object){
			this.method = method;
			this.object = object;
		}
		
		public void invoke(Object event){
			try {
				method.invoke(object, event);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
}
