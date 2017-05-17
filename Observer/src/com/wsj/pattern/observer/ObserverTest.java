package com.wsj.pattern.observer;

import com.wsj.eventbus.EventBus;
import com.wsj.eventbus.event.BossComeEvent;
import com.wsj.eventbus.event.BossLeaveEvent;

public class ObserverTest {
	public static void main(String[] args){
		Boss boss = new Boss("老板");
		
		Sleeper sleep1 = new Sleeper("熊大");
		Sleeper sleep2 = new Sleeper("熊二");
		
		Player player1 = new Player("Moon");
		Player player2 = new Player("Sky");
		
		EventBus.getInstance().post(new BossComeEvent());
		
		EventBus.getInstance().post(new BossLeaveEvent());
		
		try {
			Class clazz =  Class.forName("com.wsj.eventbus.event.BossLeaveEvent");
			EventBus.getInstance().post(clazz.newInstance());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		boss.addObserver(sleep1);
//		boss.addObserver(sleep2);
//		boss.addObserver(player1);
//		boss.addObserver(player2);
//		
//		boss.dispath();
//		
//		boss.removerServer(player2);
//		boss.removerServer(sleep1);
//		
//		boss.dispath();
	}
	
	
}
