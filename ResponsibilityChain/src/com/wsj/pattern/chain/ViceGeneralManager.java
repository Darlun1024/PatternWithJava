package com.wsj.pattern.chain;

public class ViceGeneralManager extends Handler{

	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.level<30){
			System.out.println("副总经理:"+name+" 同意 "+request.applicant+request.request);
		}else{
			//System.out.println("副总经理:"+name+"没有权限处理"+request.applicant+"的请求,提交给上级处理");
			this.superHandler.handleRequest(request);
		}
	}

}
