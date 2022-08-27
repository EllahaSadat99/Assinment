package javaRevision;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Average of array elements
		
		double [] array = {15.5, 43.5, 22.5, 99.6, 77.4};
		System.out.println("Average of double array elements ");
		
	double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total =  total + array [i] ;
			
		}
		
		double average = total / array.length;
		System.out.println("Aversge of array : "  + average);
		System.out.println("************* " + total);
		

	}

}
