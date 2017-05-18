package com.wsj.pattern.memo;

public class Code {
	String text;
	public Code() {
		// TODO Auto-generated constructor stub
		text = new String();
	}
	
	public Version createVersion(){
		Version version = new Version(text);
		return version;
	}
	
	public void restore(Version version){
		this.text = version.getText();
	}
	
	
	public void appendCode(String code){
		text = text+code;
	}
	
	public void print(){
		System.out.println(text);
	}

}