package basic;

public class foreachexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages [] = {14,16, 15, 17, 18, 19, 20, 21, 22,23, 24};
		int average=0; 
		
		
		System.out.println("Ages of the group are : ");
		
		 for (int i : ages) {
			 System.out.println(i);
			 average += i;
			 
			 
		 }
		 System.out.println("\nAverage age of the group : "+( average /10));
		  // using the for loop 
		 
		 System.out.println("Print with the for loop");
		 
		 for (int i = 0; i < 10; i++) {
			 System.out.println(ages [i]);
		 }
		 System.out.println("Average age of the group:" + (average/ 10));
			 
			 
			
			
		}
		
		

	

}

