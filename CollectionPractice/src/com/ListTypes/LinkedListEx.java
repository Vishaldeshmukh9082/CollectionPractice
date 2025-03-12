package com.ListTypes;

import java.nio.file.DirectoryStream.Filter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LinkedListEx {  //Is Not Synchronized (Not Thread Safe)

	public static void main(String[] args) {
		
	
		ArrayList<String> names = new ArrayList<>();
        names.add("alice");
        names.add("Bob");
        names.add("Eve");
        names.add("Frank");
        names.add("Charlie");
        names.add("David");
        
        
        
        
		
		///spliterator  use for parallel processing 
//        Spliterator<String> firstsplit=names.spliterator();
//        
//        Spliterator<String> secondsplit=firstsplit.trySplit();
//        
//        System.out.println("first split");
//        firstsplit.forEachRemaining(System.out::println);
//        
//        System.out.println("second split");
//        secondsplit.forEachRemaining(System.out::println);
//        
        System.out.println();
		
		//stream provides functional-style operations (e.g., filtering, mapping). //does not modify real one
		
		List<String> UpperCaseList=names.stream()
												.map(String::toUpperCase)  //perform operation
												.collect(Collectors.toList()); //convert elements into list
		
		System.out.println(UpperCaseList);
		
		System.out.println(names);
		
		List<String> filterList=names.stream()
											.filter(name -> name.startsWith("a",1))
											.collect(Collectors.toList());
		System.out.println(filterList);
		
		
		
		//Normal List 
		List<Integer> list=new LinkedList<>();
		
	
		list.add(21);
		list.add(22);
		list.add(112);
		
		//LinkedList Reference variable which give function of LinkedList
		
		LinkedList<Integer> list2=new LinkedList<>();
		list2.add(111);
		list2.add(112);
		list2.add(111);
		
		
		list2.addFirst(100);
		list2.addLast(999);
		System.out.println(list2);
	
		
		
		
		//list2.removeFirst(); 
		//list2.removeLast();
		//list2.removeFirstOccurrence(111);  // remove first occurred element  in list
		//list2.removeLastOccurrence(111);   // remove last occurred element  in list
		

		
		list.addAll(list2);
		list.retainAll(list2); // take only those elements which was similar to list2 other should get deleted
		
		
		
		Object[] arr=list.toArray(); //take all list elements in array
		
		//for(Object a:arr) {
		//	System.out.println(a);
		//}
		
		
		list.clear(); //remove all elements

		
	}

}
