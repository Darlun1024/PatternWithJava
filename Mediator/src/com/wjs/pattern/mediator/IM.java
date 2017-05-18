package com.wjs.pattern.mediator;

public class IM {
	protected User user1;
	protected User user2;
	
	public void setUser1(User user){
		this.user1 = user;
	}
	
	public void setUser2(User user){
		this.user2 = user;
	}
	
	public IM() {
		// TODO Auto-generated constructor stub
	}
	
	public void talk(User user,String message){
		if(user.equals(user1)){
			user2.getMessage(message);
		}else{
			user1.getMessage(message);
		}
	}

}