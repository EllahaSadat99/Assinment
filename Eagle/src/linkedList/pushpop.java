package linkedList;

import java.util.LinkedList;

public class pushpop {

	public static void main(String[] args) {
          // push ------   insert the element at the front of the list 
		 
		LinkedList <String> list = new 	LinkedList <String> ();
		
		list.add("Tom");
		list.add("Jack");
		list.add("Sara");
		list.add("Zara");
		System.out.println("linkedlist is : " + list);
		
		list.add("Mike");
		System.out.println("linkedlist is : " + list);
		
		// push 
		
		list.push("Susan");
		System.out.println("linkedlist is : " + list);
	
		//  pop   remove and returns the first element of the list
		
		System.out.println("Element removed : " + list.pop());
		System.out.println("Element removed : " + list.pop());
		System.out.println("Element removed : " + list.pop());
		System.out.println(list);
		
	}

}
