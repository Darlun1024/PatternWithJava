package com.wsj.pattern.observer;

import com.wsj.eventbus.EventBus;
import com.wsj.eventbus.SubScribe;
import com.wsj.eventbus.event.BossComeEvent;
import com.wsj.eventbus.event.BossLeaveEvent;

public class Player implements Observer {
	private String mName;
	public Player(String name){
		mName = name;
		EventBus.getInstance().regist(this);
	}
	
	@Override
	public void alertMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(mName+"：关掉了游戏");
	}
	
	
	@SubScribe
	public void onBossCome(BossComeEvent event){
		System.out.println(mName+"：关掉了游戏");
	}
	
	@SubScribe
	public void onBossLeave(BossLeaveEvent event){
		System.out.println(mName+"：打开了游戏");
	}

}
