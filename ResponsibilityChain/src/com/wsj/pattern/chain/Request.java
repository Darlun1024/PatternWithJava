package com.wsj.pattern.chain;

public class Request {

	public String applicant;
	public String request;
	public int level;
	
	/**
	 * @param applicant 申请人
	 * @param request   申请内容
	 * @param level     级别
	 */
	public Request(String applicant,String request,int level){
		this.applicant = applicant;
		this.request   = request;
		this.level     = level;
	}
	

}