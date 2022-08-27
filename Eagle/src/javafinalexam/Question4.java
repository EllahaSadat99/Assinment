package javafinalexam;
import  java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		int x ,y, z;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First number : ");
		x = sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		y = sc.nextInt();
		
		System.out.println("Enter the Thied Number : ");
		z = sc.nextInt();
		
		if (x>=y && x>= z) {
			System.out.println("\nThe Largest Number  : " + x);
				

			System.out.println("\nTher Largest Number : " +y);
			}
			else 
				System.out.println("\nTher Largest Number : " +z);
				
				
				
	}

}


