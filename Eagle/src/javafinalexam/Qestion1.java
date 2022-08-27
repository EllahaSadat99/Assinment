package javafinalexam;
import java.util.Scanner;

public class Qestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Employee Name : ");
		Scanner obj = new Scanner (System.in);
		String name = obj.nextLine();
		
		System.out.println("Enter The Employee Age :  ");
		int age = obj.nextInt();
		
		System.out.println("Enter The Employee Salary : ");
		float salary = obj.nextFloat();
		
		
	System.out.println("Employee Name is :  "   + name);
	System.out.println("Employee Age  is :  " + age);
	System.out.println("Employee Salary  is :  " + salary);
		
		
		
		
		

	}

}
