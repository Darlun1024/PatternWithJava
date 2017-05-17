package com.wsj.pattern.command;

public abstract class WordCommand implements ICommand{
	public Document document;
	public WordCommand(Document doc){
		this.document = doc;
	}
	
}
