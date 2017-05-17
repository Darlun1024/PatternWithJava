package com.wsj.pattern.state;

public class OldAge extends State {

	public OldAge(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run100() {
		System.out.println(person.age+"岁: 还让我跑？");
	}

}
