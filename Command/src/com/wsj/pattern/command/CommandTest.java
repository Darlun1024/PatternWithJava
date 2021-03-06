package com.wsj.pattern.command;

public class CommandTest {         
	
	public static void main(String[] args){
		Document document = new Document();
		Word word = new Word();
		AppendCommand append1 = new AppendCommand("hello,", document);
		AppendCommand append2 = new AppendCommand(" world!", document);
		AppendCommand append3 = new AppendCommand("你好，", document);
		AppendCommand append4 = new AppendCommand("世界！", document);
		InsertCommand command = new InsertCommand(" hehehe ", 5,document);
		
		word.addCommand(append1);
		word.addCommand(append2);
		word.addCommand(append3);
		word.addCommand(append4);
		word.addCommand(command);
		
		word.execute();
		
		document.print();
		
		word.undo();
		document.print();
		word.undo();
		document.print();
		word.undo();
		document.print();
		word.undo();
		document.print();
		
		word.redo();
		document.print();
		
	
		word.execute();
		document.print();
		word.undo();
		document.print();
	
	}
	
} 
