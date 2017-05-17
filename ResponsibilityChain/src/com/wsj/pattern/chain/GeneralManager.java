package com.wsj.pattern.chain;

public class GeneralManager extends Handler {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Request request) {
		System.out.println("总经理:"+name+" 同意 "+request.applicant+request.request);
	}

}
