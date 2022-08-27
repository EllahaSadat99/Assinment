package linkedList;

import java.util.LinkedList;

public class PeekMethods {

	public static void main(String[] args) {
		/*
		 peek ()
		 */
         LinkedList <String> list = new 	LinkedList <String> ();
		
		list.add("Tom");
		list.add("Jack");
		list.add("Sara");
		list.add("Zara");
		System.out.println("linkedlist is : " + list);
		
		// peek 
		System.out.println("Retrive "   + list.peek());
		System.out.println("Display list :  "   + list);
		

	}

}
