package com.wsj.pattern.visitor;

public class Woman extends Person {

	public Woman() {
	}

	@Override
	void accept(IAction action) {
		action.visitWoman(this);
	}

}
