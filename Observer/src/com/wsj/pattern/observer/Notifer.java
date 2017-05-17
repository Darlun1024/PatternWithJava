package com.wsj.pattern.observer;

public interface Notifer {
	void addObserver(Observer observer);
	void removerServer(Observer observer);
	void dispath();
}
