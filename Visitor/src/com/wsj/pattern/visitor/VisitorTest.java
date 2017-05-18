package com.wsj.pattern.visitor;

import javax.lang.model.element.ElementVisitor;

public class VisitorTest {

	public static void main(String[] args){
		World world = new World();
		world.addPerson(new Man());
		world.addPerson(new Woman());
		
		IAction marriage = new Marriage();
		world.accept(marriage);
		IAction shop = new Shopping();
		world.accept(shop);
	}
}
