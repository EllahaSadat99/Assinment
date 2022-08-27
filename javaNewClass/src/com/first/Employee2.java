package com.first;

public class Employee2 {

	
		
		String name = "Kamal";
		public int age = 32;
		private static String collage = "Haevard";
		
		public String showinfo () {  // local veriable always cearte in a methode
		
			String firstName = "Ahmad";
			String  lastName = "Sardari";
			
			return firstName + lastName;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Employee2 thEmployee = new Employee2();
		
			System.out.println( thEmployee.name);
			System.out.println( thEmployee.age);
			System.out.println( thEmployee.collage);
			System.out.println( thEmployee.showinfo());
	}
		

	}


