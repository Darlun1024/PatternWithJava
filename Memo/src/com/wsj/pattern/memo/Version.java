package com.wsj.pattern.memo;

public class Version {
	String text;
	String name; //为版本命名
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Version(String text) {
		this.text = text;
	}
	
	public String getText(){
		return text;
	}

}
