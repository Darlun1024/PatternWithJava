package com.wsj.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private StringBuilder stringBuilder = new StringBuilder();
	
	public void append(String s){
		stringBuilder.append(s);
	}
	
	public void insert(String s,int index){
		stringBuilder.insert(index,s);
	}
	
	public void remove(String s){
		int index = stringBuilder.lastIndexOf(s);
		remove(s,index);
	}
	
	
	public void remove(String s,int index){
		stringBuilder.delete(index,index+s.length());
	}
	
	public void print(){
		System.out.println(stringBuilder.toString());
	}
}
