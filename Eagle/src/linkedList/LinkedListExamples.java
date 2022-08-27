package linkedList;
import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {
		
		LinkedList <String> list = new 	LinkedList <String> ();
		
		System.out.println("Display LinkedList : " + list);
		
		list.add("Jasmine1");
		list.add("Jasmine2");
		list.add("Jasmine3");
		list.add("Jasmine4");
		
		System.out.println("Display LinkedList : " + list);
		
		list.add("Ahmad");
		System.out.println("Display LinkedList : " + list);
		
		list.add(1,"Zara");
		System.out.println("Display LinkedList : " + list);
		
		// Iterator
	 //  Iterator  it = 	list.iterator ();
    //	while (it.hasNext( )) {
		{
		
		list.remove("Jasmine2");
		System.out.println("removing Jasmine2 : " + list);
		
		Object sl = list.remove();
		System.out.println("removing the last value: " + list);
		
		for (String name : list) {
			System.out.println("name : " + name);
			
		}
		
		list.clear();
		System.out.println("**************" + list);
		
		//Object firstElement = list.getFirst();
		//System.out.println("First Element is " +  firstElement );
		
		//Object lastElement = list.getLast ( );
		
		//System.out.println("last element : " + lastElement );
		
		
		// for loop
		for (int i = 0; i < list.size( );  i++) {
			System.out.println("Element at index : " + list.get(i));
			
		}
		
		}
		}
	}

				
					
				
			
		
			
		
	
		
		


	


