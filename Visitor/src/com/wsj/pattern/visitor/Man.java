package com.wsj.pattern.visitor;

public class Man extends Person {

	public Man() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void accept(IAction action) {
		action.visitMan(this);
	}

}
