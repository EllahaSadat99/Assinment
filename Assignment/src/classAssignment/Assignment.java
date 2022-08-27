package classAssignment;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  Obj = new Scanner  (System.in);
		
		System.out.println("Enter Name , Age , Salary");
		
		String Name = Obj.nextLine();
		int Age = Obj.nextInt();
		float Salary = Obj.nextFloat();
		
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Salary);

	}

}
