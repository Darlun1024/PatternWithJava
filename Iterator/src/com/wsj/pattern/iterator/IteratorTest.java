package com.wsj.pattern.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMap<String, String> map= new MyMap<>();
		map.put("武思杰", "1986");
		map.put("焦广平", "1989");
		map.put("张凯军", "1991");
		map.put("刘旭",  "1992");
		map.put("赵友志",  "1992");
		
		Iterator<String> iterator = map.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
