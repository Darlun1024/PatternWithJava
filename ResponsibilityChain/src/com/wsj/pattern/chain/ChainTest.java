package com.wsj.pattern.chain;

public class ChainTest {
	
	public static void main(String[] args){
		Request request = new Request("焦广平", "请假半天", 5);
		Request request1 = new Request("焦广平", "请假1天", 11);
		Request request2 = new Request("焦广平", "请假2天", 21);
		Request request3 = new Request("焦广平", "请假5天", 50);
		Manager manager = new Manager("武思杰");
		Director director = new Director("王明");
		ViceGeneralManager viceGeneralManager = new ViceGeneralManager("许总");
		GeneralManager generalManager = new GeneralManager("朱总");
		manager.setSuperior(director);
		director.setSuperior(viceGeneralManager);
		viceGeneralManager.setSuperior(generalManager);
		
		manager.handleRequest(request);
		manager.handleRequest(request1);
		manager.handleRequest(request2);
		manager.handleRequest(request3);
	}
}
