package com.wsj.pattern.command;

public class InsertCommand extends WordCommand  {
	private int index;
	private String text;
	public   InsertCommand(String text,int index,Document document) {
		super(document);
		this.index = index;
		this.text  = text;
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.document.remove(text,index);
	}

	@Override
	public void redo() {
		this.document.insert(text, index);
	}

}
