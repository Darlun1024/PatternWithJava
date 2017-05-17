package com.wsj.pattern.chain;

public abstract class Handler {
	public String name;
	protected Handler superHandler;
	public Handler(String name){
		this.name = name;
	}
	public abstract void handleRequest(Request request);
	public void setSuperior(Handler handler){
		this.superHandler = handler;
	}
}
