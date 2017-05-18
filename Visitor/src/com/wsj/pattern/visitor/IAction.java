package com.wsj.pattern.visitor;

public interface IAction {

	void visitMan(Man man);
	void visitWoman(Woman woman);
}
