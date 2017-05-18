package com.wsj.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class World {

	List<Person> personList = new ArrayList<>();
	
	public World() {
		// TODO Auto-generated constructor stub
	}
	
	public void addPerson(Person person){
		personList.add(person);
	}
	
	public void removePerson(Person person){
		personList.remove(person);
	}
	
	public void accept(IAction action){
		personList.forEach(person->person.accept(action));
	}

}
