package autoboxingUnboxing;

public class autoboxingExample {
	// cass to convert primative type to wrapper class with autoboxing
	public static void  myMethod (Integer num ) {
		System.out.println(num);
		
	}

	public static void main(String[] args) {
    // Autoboxing 
   // int -- > Integer 
		// double --> Double
		System.out.println("This is a primative type of int ");
		myMethod( 5);
		
	}

}
