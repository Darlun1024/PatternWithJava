package com.wjs.pattern.mediator;

public class MediatorTest {
	

	public static void main(String[] args){
		IM QQ = new IM();
		User lilei= new User("LiLei", QQ);
		User hanmm= new User("Hanmm", QQ);
		QQ.setUser1(lilei);
		QQ.setUser2(hanmm);
		
		lilei.talk("hello");
	}
	
}
