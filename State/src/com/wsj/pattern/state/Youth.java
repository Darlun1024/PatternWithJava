package com.wsj.pattern.state;

public class Youth extends State {

	public Youth(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run100() {
		if(person.age > 35){
			person.setState(new Midlife(person));
			person.run100();
		}else{
			System.out.println(person.age+"岁: 风驰电掣 14秒跑完全程");
		}
	}

}
