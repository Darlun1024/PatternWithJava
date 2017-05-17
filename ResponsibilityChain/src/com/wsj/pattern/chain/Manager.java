package com.wsj.pattern.chain;

public class Manager extends Handler {
	
	public Manager(String name){
		super(name);
		this.name = name;
	}
	
	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.level<10){
			System.out.println("经理:"+name+" 同意 "+request.applicant+request.request);
		}else{
			//System.out.println("经理:"+name+"没有权限处理"+request.applicant+"的请求,提交给上级处理");
			this.superHandler.handleRequest(request);
		}
	}

	

}
