package stringBufferBulder;

public class StringBufferMain {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer ("Welcom ");
		int len = str.length( );
		
		System.out.println(str);
		System.out.println("Lenght: " + len);
		// it defines the  capacity of the string occupied in the buffer . 
		int cap = str.capacity();
		System.out.println(cap);
		
		 // append 
		str.append( " to java");
		System.out.println(str);
		System.out.println(cap);
		
		// insert 
		str.insert(14, " him");
		System.out.println(str);
		
		str.insert( 0, "lets  ");
		System.out.println(str);
		
		// reverse 
		str.reverse( );
		System.out.println(str);
		
		str.delete( 0, 2);
		System.out.println(str);
		
		
		
		
		

	}

}
