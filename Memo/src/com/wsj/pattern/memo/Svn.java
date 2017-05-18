package com.wsj.pattern.memo;

import java.util.ArrayList;
import java.util.List;

public class Svn {
	List<Version> versionList = new ArrayList<>();
	public Svn() {
		// TODO Auto-generated constructor stub
	}
	
	public void addVersion(String name,Version version){
		version.name = name;
		if(versionList.contains(version))return;
		versionList.add(version);
	}
	
	public Version getVersion(int index){
		return versionList.get(index);
	}
	
	public void log(){
		versionList.forEach(version->System.out.println(versionList.indexOf(version)+":"+version.name));
	}
	

}
