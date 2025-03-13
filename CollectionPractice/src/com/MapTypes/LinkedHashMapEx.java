package com.MapTypes;

import java.util.*;

public class LinkedHashMapEx {   //get data in  insertion order(false) OR last unacsess Order(true)
								//Extends HashMap Time complexity different
								//Not thread Safe
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linkmap=new LinkedHashMap<>(17,3.f,false);
		
		linkmap.put(1, "prdanya");
		linkmap.put(2, "jagriti");
		linkmap.put(3, "Darshan");
		
		linkmap.putIfAbsent(4, "abhishesk");
		
		System.out.println(linkmap.getOrDefault(4, "no Found"));
		
		for(Map.Entry<Integer, String> row:linkmap.entrySet()) {
			System.out.println("SrNo : "+row.getKey()+" |  Name : "+row.getValue());
		}
		
		
		
		
		System.out.println(linkmap);
		
		linkmap.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByValue())
		   .forEach(System.out::println);
		
		LinkedHashMap newhashmap=new LinkedHashMap<>(linkmap);
		System.out.println("New HashMap = "+newhashmap);
		
	}
}
