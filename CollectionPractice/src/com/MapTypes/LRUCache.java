package com.MapTypes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//Question to set fix size of linkedHashMap 
// contain only last 3 elements 
public class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	int capacity ;
	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity=capacity;
	}
	
	
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > capacity;
	}


	public static void main(String[] args) {
		LRUCache<Integer, String > mapex=new LRUCache<>(3);
		mapex.put(1,"BMW");
		mapex.put(2,"Lambo");
		mapex.put(3,"Audi");
		mapex.put(4,"Mursadrs");
		
		//mapex.get(2);
		
		System.out.println(mapex);
		//mapex.put(1,"BMW");
	}
}
