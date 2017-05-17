package com.wsj.pattern.state;

public class Baby extends State {

	public Baby(Person person) {
		super(person);
	}

	@Override
	void run100() {
		if(person.age > 2){
			person.setState(new Child(person));
			person.run100();
		}else{
			System.out.println(person.age+"岁: iiieeeeaadadsa");
		}
	}
}
