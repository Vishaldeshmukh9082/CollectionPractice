package com.MapTypes;

import java.util.*;

public class HashMapEx {  //Unsynchronized   //Unordered //fast //allow null key & value
						  //get and put o(1)before Java8 and after that o(log n) 
	
	
	/*Internal Strucure Of HashMap
	 * 
	* Component
	1. Key    - is used to find data
	2. Value   - Is the data	
	3. Bucket  - is where key and value get stored (array)
	4. Hash Function  -  it generate fix size hash code using Id which use to store data in bucket
	
	id ->hash Function ->hash key is used to store key-value pain in bucket Array
	
		int index= hashcode % arraysize;   //by default arraysize is 16
		
		it store linklist in the index to avoid collision / before Java8 (it takes to much time to find data)
		
		after java * it uses balanced Binary Search Tree(RedBlack Tree)
		
		// Resizing 
		 * 
	*/
	
	
	
	public static void main(String[] args) {

		
		Map< Integer, String> map1=new HashMap<>();
		map1.put(2,"Tushar");
		map1.put(3, "Shreyash");
		map1.put(1,"satish");
		map1.put(null,"vd");
		map1.put(1,"divya");
		map1.put(null,"vishal");
		
		System.out.println("Keys In Map : "+map1.keySet());  //gives all keys
		System.out.println("Values In Map : "+map1.values());	//give all values
		

		
		System.out.println("Key 2 Present : "+map1.containsKey(2));
		
		System.out.println("Value 2 Present : "+map1.containsValue("satish"));
		
		for(Map.Entry<Integer,String> map2 : map1.entrySet()) {
			System.out.println(map2.getKey()+ " "+map2.getValue());
		}
		
		System.out.println("Record Deleted "+map1.remove(null));
		System.out.println("Record Delete Using Key & value "+map1.remove(1,"divya"));
		
		System.out.println("Display Using KeySet : ");
		for(Object i:map1.keySet()) {
			System.out.print(i+"->"+map1.get(i) +" ");
		}
		
		//map1.compute(null, null)
		
		Map<Integer,String> map2=new HashMap<>();
		
		map2.put(11,"india");
		map2.put(12,"japan");
		
		//map1.merge(2, "s", String::concat);
		System.out.println();
		map1.putAll(map2);
		
		System.out.println(map1);
		
		
		
	}

}
