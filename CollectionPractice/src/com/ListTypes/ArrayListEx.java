package com.ListTypes;

import java.util.*;


//compare with id
class CompareId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 
		return o1.getId()- o2.getId();
	}
}

//compare with Name
class CompareName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 
		return o1.getName().compareTo(o2.getName());
	}
}

//compare with Marks
class CompareMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 
		return (int) (o2.getMarks()- o1.getMarks());
	}
}


public class ArrayListEx {  //Is Not Synchronized (Not Thread Safe)


	public static void main(String[] args) {

		
		
		Student s1=new Student(1,"sujal",99);
		Student s2=new Student(2,"sumit",87);
		Student s3=new Student(3,"omkar",98);
		
		
		ArrayList< Student> studentlist=new ArrayList<>(2);
		studentlist.add(s3);
		studentlist.add(s1);
		studentlist.add(s2);
		
		
		
		
		
		/// we create Student class and implement Comparable interface and override toCompare method write a compare logic on id field
		studentlist.sort(null);
		studentlist.forEach(System.out::println);
		
		
		//We Create CompareName class and implements Comparator interface,pass Student class as Generic type and override toCompare method and write sorting logic for name 
		studentlist.sort(new CompareName());
		studentlist.forEach(System.out::println);
		
		
	
		
		///Normal ArrayList Methods
//		List<Integer> numlist=new ArrayList<>();
//		List<Integer> numlist2=new LinkedList<>();
//		numlist2.add(1);
//		numlist2.add(2);
//		numlist2.add(3);
//		
//		numlist.add(11);
//		numlist.add(12);
//		numlist.add(1,13);
//		numlist.add(14);
//		
//		
//		
//		numlist.sort(new ComparatorFormula());
//		System.out.println(numlist);
//		
//		
//		
//
//		Collections.sort(numlist);
//		Collections.reverse(numlist);
//
//		
//		System.out.println(numlist.indexOf(11));  //give index of value
//		numlist.forEach(System.out::print); //print the list 111213
//		
//		
//		System.out.println(numlist.equals(numlist2)); //compare to lists
//		System.out.println(numlist.contains(11)); //true
//		System.out.println(numlist.contains(numlist2)); //false
//		
//		
//		
//		numlist.addAll(numlist2);  //add new list2 in list1  //[11,12,13,1,2,3]
//		numlist.addAll(1,numlist2); //add new list at index  //[11,1,2,3,12,13]
//		
//		System.out.println(numlist.removeIf(a-> a %2==0)); //remove elements by checking the condition
//		numlist.forEach(System.out::println); 
//		System.out.println(numlist.remove(1)); //remove specific index //removeAll
//		numlist.forEach(System.out::println);
	

	}

}
