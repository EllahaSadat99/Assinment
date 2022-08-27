package superkeyword;

public class subclass {
	
	int number = 100 ; 
	// defualt method
	void printNumber () {
		// super
		System.out.println(super.number);
		number= 122;
		// default data member
		System.out.println(number);
		
		
	}
	public static void main(String[] args) {
     // create object 
		 subclass obj = new  subclass ( );
		 		obj.printNumber( );
		 		
	}

}
