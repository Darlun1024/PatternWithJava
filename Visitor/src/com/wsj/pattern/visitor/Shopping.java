package com.wsj.pattern.visitor;

public class Shopping implements IAction {

	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitMan(Man man) {
		System.out.println("男人逛街时，心不在焉");
	}

	@Override
	public void visitWoman(Woman woman) {
		System.out.println("女人逛街时，磨磨蹭蹭");
	}

}
