package javaRevision;

public class Fib0nacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 7;
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series of " + count + "number");
		for (int i = 1 ;  i <=count  ;  i++) {
		System.out.println("point : " + num1);
			// sum of two previous number 
			int sumOfpreTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfpreTwo;
	
		}
		

	}

}
