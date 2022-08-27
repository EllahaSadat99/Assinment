package javaRevision;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int reverseNumber = 0;
		
		 while ( number  != 0 ) {
			 reverseNumber = reverseNumber * 10;
			 reverseNumber = reverseNumber + number % 10 ;
			 
		number =	 number  /10; 
			 
			 
		 }
		 System.out.println("*********** :" +   reverseNumber);

	}

}
