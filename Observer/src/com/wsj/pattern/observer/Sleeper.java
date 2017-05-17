package com.wsj.pattern.observer;

import com.wsj.eventbus.EventBus;
import com.wsj.eventbus.SubScribe;
import com.wsj.eventbus.event.BossComeEvent;
import com.wsj.eventbus.event.BossLeaveEvent;

public class Sleeper implements Observer {
	private String mName;
	public Sleeper(String name){
		mName = name;
		EventBus.getInstance().regist(this);
	}
	
	@Override
	public void alertMessage(String message) {
		System.out.println(mName+"：赶紧起来");
	}

	@SubScribe
	public void onBossCome(BossComeEvent event){
		System.out.println(mName+"：赶紧起来");
	}
	
	@SubScribe
	public void onBossLeave(BossLeaveEvent event){
		System.out.println(mName+"：继续睡觉");
	}

}
