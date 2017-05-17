package com.wsj.pattern.iterator;

public interface Iterator<T> {

	T next();
	boolean hasNext();
	boolean isDone();
	
}
