package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList< String >  obj = new ArrayList < String> () ; 
		// size is zero 
		System.out.println(obj );
		
		// .add 
		obj.add( "Ajeet");
		obj.add( "Tom");
		obj.add( "Steve");
		obj.add( "Sara");
	  System.out.println("Displaying the ArrayList: " +  obj );
	  // Display elements
	  for (String str : obj) {
		  System.out.println("Name : " + str);
		  
		  // adding new element 
		  obj.add("Mike");
		  obj.add("Susan");
		  
		  for (String  str : obj) {
			  System.err.println("Name : + str");
			
		}
		  
		  
		  
		  
		  
		  
		  
		
	}
		
		
	
		

	}

}
