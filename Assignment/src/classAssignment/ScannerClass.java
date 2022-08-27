package classAssignment;

import java.util.Scanner;

public class ScannerClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of the elements :-");
		int number = scan.nextInt();
		
		int array [] = new int [number];
		
		System.out.println(" Enter the array elements");
		for (int i =0; i < array.length; i++) {
			array [i] = scan.nextInt();
		
		}
		
		
		
		
		
		
		
	   
		
		

	}

}
