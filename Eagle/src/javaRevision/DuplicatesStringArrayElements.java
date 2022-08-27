package javaRevision;

public class DuplicatesStringArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// intializing Array of String
		
		String [] names = {"Ahmad", "Steve", "Ahmad", "Zara", "Steve", "Jim"};
		
		System.out.println("Duplicate Elements : ");
		
        for (int i = 0; i < names.length; i++) {
        // inner loop ---> comparing
        	for (int j = i + 1 ; j < names.length; j++) {
        		
        		if (names[i].equals(names[j])) {
        			System.out.println(names[j]);
        			
        		}
				
			}
        	
			
		}
		

	}

}
