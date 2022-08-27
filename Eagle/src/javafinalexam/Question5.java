package javafinalexam;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.println("Enter a Number to check its Odd or Even :  ");
		
		Scanner obj = new Scanner (System.in);
		x= obj.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd. ");
			
		}

	}

	}
