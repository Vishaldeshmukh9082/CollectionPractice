package com.ListTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {  //use when reading data is priority (synchronized)
	
	/*
	 * adding and removing done on clone of array instead of original list
	 * 
	 * This help other threads to read data when we modifying list
	 * 
	 * reading - is fast and direct
	 * 
	 * modification - its take more time because it create copy of list and then modify that copy and then update 
	 * */

	public static void main(String[] args) {
		
		CopyOnWriteArrayList< Integer> colist =new CopyOnWriteArrayList<>();
		
		//we can add elements when we reading list
		colist.add(1);
		colist.add(2);
		colist.add(3);
		colist.add(4);
		colist.add(5);
		colist.add(6);
		
		colist.remove(5);
		
		
		for(Integer i:colist) {
			if(i==3) {
				colist.add(i, 11);
			}
			System.out.println(i);
		}
		Collections.sort(colist);

		System.out.println("Updated List : "+colist);
		
		
		
		
		//try with ArrayList  //pass  Error
		
//		List<Integer> list=new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		System.out.println(list);
//		for(Integer i:list) {
//			if(i==3) {
//				list.add(i, 11);
//			}
//			System.out.println(i);
//		}
//		System.out.println("Updated List : "+list);
	}

}
