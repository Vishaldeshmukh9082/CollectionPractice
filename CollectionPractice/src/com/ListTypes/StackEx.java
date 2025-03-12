package com.ListTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class StackEx { // is extends Vector (Is Synchronized and have all methods of vector)

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		//stack Methods
		stack.push(3);
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println( stack.capacity());

		System.out.println(stack.pop());
		
		
		System.out.println( "Stack Is Empty : "+stack.isEmpty());
		Collections.sort(stack);
		stack.push(2);
		System.out.println(stack);
		
		
		
		//Vector Methods 
		System.out.println();
		System.out.println("Vector Function");
		stack.add(4);
		stack.add(3,5);
		
		
		System.out.println(stack);
		stack.set(4, 6);
		System.out.println(stack);
		
		stack.remove(1);
		
		
		
		
		//Stack Using Linklist
		
		LinkedList< Integer> linkstack=new LinkedList<>();
		
		linkstack.addLast(1);
		linkstack.addLast(2);
		linkstack.addLast(3);
		System.out.println();
		System.out.println("Stack Using LinkList : "+linkstack);
		linkstack.removeLast();
		System.out.println("after Pop : "+linkstack);
		System.out.println("peek element : "+linkstack.getLast());
		
		
		//Stack Using ArrayList
		
		ArrayList< Integer> arrstack=new ArrayList<>();
		
		arrstack.add(1);
		arrstack.add(2);
		arrstack.add(3);
		
		System.out.println();
		System.out.println("Stack Using ArrayList : "+arrstack);
		arrstack.remove(arrstack.size()-1);
		System.out.println("After Pop  : "+arrstack);
		System.out.println("Peek Element : "+arrstack.get(arrstack.size()-1));
		

		
		
		
		
		

	}

}
