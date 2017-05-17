package com.wsj.pattern.state;

public class Child extends State {

	public Child(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run100() {
		if(person.age > 6){
			person.setState(new Teenager(person));
			person.run100();
		}else{
			System.out.println(person.age+"岁: 摔了四五次，4分钟跑完全程");
		}
	}

}
