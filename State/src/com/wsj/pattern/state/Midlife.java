package com.wsj.pattern.state;

public class Midlife extends State {

	public Midlife(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run100() {
		if(person.age > 60){
			person.setState(new OldAge(person));
			person.run100();
		}else{
			System.out.println(person.age+"岁: 不复当年之勇，16秒跑完了");
		}
	}

}
