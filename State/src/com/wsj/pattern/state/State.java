package com.wsj.pattern.state;

public abstract class State {
	Person person;
	public State(Person person){
		this.person = person;
	}
	
	abstract void run100();
	
}
