package javafinalexam;
import java.util.Scanner;

public class Qestion2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String scan1, scan2, temp;
		System.out.println("Enter the First String : ");
		Scanner obj = new Scanner (System.in);
		scan1 = obj.nextLine();
		
     	System.out.println("Enter the Second String : ");
     	Scanner obj1 = new Scanner (System.in);    
     	scan2 = obj.nextLine();
     	
     	System.out.println("\nString Before Swap : ");
     	System.out.println("***** : = " + scan1);
     	System.out.println("***** :  = " + scan2);
     	
     	temp = scan1;
     	scan1 = scan2;
     	scan2= temp;
     	
     	System.out.println("\nString after Swap : ");
     	System.out.println("***** : " + scan1);
     	System.out.println("***** : " + temp);
     	
     	
     	
     	
     	
     	

     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
	}

}
