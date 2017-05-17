package com.wsj.pattern.command;

public class AppendCommand extends WordCommand {
	private String text;
	public AppendCommand(String str,Document document) {
		super(document);
		this.text = str;
	}
	
	@Override
	public void undo() {
		document.remove(text);
	}

	@Override
	public void redo() {
		document.append(text);
	}

}
