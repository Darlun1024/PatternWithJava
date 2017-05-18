package com.wsj.pattern.visitor;

public class Marriage implements IAction {

	public Marriage() {}

	@Override
	public void visitMan(Man man) {
		System.out.println("男人结婚后被判有妻徒刑");
	}

	@Override
	public void visitWoman(Woman woman) {
		System.out.println("女人结婚后被上了爱情保险");
	}

}
