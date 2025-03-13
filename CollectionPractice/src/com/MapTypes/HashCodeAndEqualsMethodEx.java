package com.MapTypes;

import java.util.*;
import java.util.Objects;

class Student{
	private int rollno;
	private String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	
	
	
	
}

public class HashCodeAndEqualsMethodEx {

	public static void main(String[] args) {
		
		Map<Student,Integer> map=new HashMap<>();
		Student s1=new Student(1,"sumit");
		Student s2=new Student(2,"omkar");
		Student s3=new Student(1,"sumit");

		
		map.put(s1, 78);
		map.put(s2, 89);
		map.put(s3, 60);
		
		map.forEach( (a,b)->{
			System.out.println(a.getName()+" "+b);
		});
		
	}

}
