package com.wsj.pattern.chain;

public class Director extends Handler{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.level<20){
			System.out.println("总监:"+name+" 同意 "+request.applicant+request.request);
		}else{
			//System.out.println("总监:"+name+"没有权限处理"+request.applicant+"的请求,提交给上级处理");
			this.superHandler.handleRequest(request);
		}
	}

}
