package javaRevision;
import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter;
		Random rnum = new Random ();
		
		for (counter  = 1; counter <= 5; counter ++) {
		System.out.println(rnum.nextInt (10));	
			
		}

	}

}
