package com.wsj.pattern.iterator;

import java.util.HashMap;
import java.util.Set;

public class MyMap<K,V>{
	HashMap<K,V> map;
	Iterator<V> iterator;
	
	public MyMap(){
		map = new HashMap<>();
	}
	
	public Iterator<V> iterator(){
		iterator = new MyMapIterator<K,V>(this);
		return iterator;
	}
	
	public void put(K key,V value){
		map.put(key, value);
	}
	
	public V get(K key){
		return map.get(key);
	}
	
	public Set<K> keySet(){
		return map.keySet();
	}
}
