
public class ArrayExample2 {

	public static void main(String[] args) {
		// declare an Array
		
		double [] myList = {1.9,2.9,3.9,4.9,5.9,}; // sum?
		
		//print all the elements of array 
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i]+" ");
			
		}
		// summing all the elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
		total += myList[i];
		}System.out.println("\nThe total of double array is:"+total);
		// finding the largest element 
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if(mylist[i]>max) max = myList[i];
			
			}
		
		// find the min elements
		double min = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if(myList[i]< min)min = myList[i];
			System.out.println("The min element is :"+ min);
			
		}
		
		

	}

}
