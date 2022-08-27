package javaRevision;
import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] intArr = {4,2,9,8,3,7,1};
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("Not sorted Element : " + intArr[i]);
			
		}
		// sorting Array 
		Arrays.sort(intArr);
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("Element : " + intArr[i]);
			
		}
		String [] stringArrayStrings = {"F", "A", "B", "C", "E", "D"};
		for (int i = 0; i < stringArrayStrings.length; i++) {
			Arrays.sort(stringArrayStrings);
			System.out.println("String Elements : " + stringArrayStrings [i]);
			
		}

	}

}
