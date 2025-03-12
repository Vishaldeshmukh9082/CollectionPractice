package com.ListTypes;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {  //Is  Synchronized ( Thread Safe)

	public static void main(String[] args) {
		
		Vector< Integer> vect=new Vector<>(); //default capacity 10
		System.out.println("Default capacity of vector "+vect.capacity());
		
		Vector<Integer> vect1=new Vector<>(5);  // capacity is 5
		
		vect.add(11);
		vect.add(13);
		vect.add(12);
	
		System.out.println(vect);

		
		vect1.add(123);
		vect1.add(121);
		vect1.add(122);
		
		vect.addAll(vect1);
		
		System.out.println(vect);
		
		System.out.println("First Element : "+vect.firstElement());
		System.out.println("Last Element : "+vect.lastElement());

		
		// Thread Safe 
		
		Vector<Integer> vect2=new Vector<>(5,11);  // capacity is 5 and  increment by 11
		
		ArrayList<Integer> arrlist=new ArrayList<>();
 
		long startime=System.currentTimeMillis();
		Thread t1=new Thread(()->{
			for(int i=1;i<=100;i++) {
				vect2.add(i);
				arrlist.add(i);    //arraylist oject
			}
		});
		
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=100;i++) {
				vect2.add(i);
				arrlist.add(i);  //arraylist oject
			}
		});
		System.out.println();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		long endtime=System.currentTimeMillis()-startime;
		
		System.out.println(vect2.size());       //always same 200
		
		System.out.println(arrlist.size());   //arraylist size  //change every time
		
		System.out.println(endtime);
		

		
		
	}

}
