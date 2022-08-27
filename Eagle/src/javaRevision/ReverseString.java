package javaRevision;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// Reverse String 
		
		String str1 = " "; 
		System.out.println("Enter a string to see its reversed");
		Scanner scan = new Scanner (System.in);
		scan.close();
		
		
		String  str = "Wellcome to the interview";
		String  reversed=  reverseString (str);
		System.out.println("++++++++++++++" + str);
		System.out.println("========== " + reversed);
		
		
	}
	     public static String reverseString (String str) {
	    	 
	    	 if (str.isEmpty())
	    		 return str ;
	    	 // calling reverse function 
	     return reverseString (str.substring(1)) + str.charAt(0);
	}

}
