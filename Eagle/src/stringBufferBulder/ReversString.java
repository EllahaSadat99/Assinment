package stringBufferBulder;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println("Original String : " + str);
		String result = reverseString ( str);
		System.out.println("Reverse String of original : " + str);

	}
	
	public static String reverseString( String str) { 
		if ( str.isEmpty( ))
			return str ; 
		// calling function 
		return reverseString ( str.substring ( 1 ) )+ str.charAt( 0);
		
		
		
	}
	

}
