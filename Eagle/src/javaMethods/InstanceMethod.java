package javaMethods;

public class InstanceMethod {

	public static void main(String[] args) {
		// creating object of instance class 
		InstanceMethod obj = new InstanceMethod();
		System.out.println(obj.mul(9, 13));
		

	}
	  int m ; 
	public int mul (int x , int y) {
		  m = x * y ; 
		 return m ; 
		 
	}

}
