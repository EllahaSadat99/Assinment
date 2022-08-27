package linkedList;

import java.util.LinkedList;

public class IfElseLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> linkedlist = new 	LinkedList <String> ();
		
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		linkedlist.add("EE");
		linkedlist.add("FF");
		linkedlist.add("GG");
		
		if(linkedlist.contains("BB") ) {
			System.out.println("Element BB is peresent in the list of object");
		}
		else {
			System.out.println("Element does not exist");
		}
		System.out.println("List if object: " + linkedlist);

	}

}
