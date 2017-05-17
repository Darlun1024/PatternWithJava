package com.wsj.pattern.state;

public class Person {
	public String name;
	public int age;
	
	State currentState;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setState(State state){
		this.currentState = state;
	}
	
	public void run100(){
		currentState.run100();
	}
	
}
