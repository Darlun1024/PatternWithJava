package com.wsj.pattern.state;

public class StateTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("小小", 1);
		Baby baby = new Baby(person);
		person.setState(baby);
		person.run100();
		person.setAge(5);
		person.run100();
		person.setAge(13);
		person.run100();
		person.setAge(25);
		person.run100();
		person.setAge(36);
		person.run100();
		person.setAge(70);
		person.run100();
	}
	

}
