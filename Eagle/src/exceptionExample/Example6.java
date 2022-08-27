package exceptionExample;

public class Example6 {
	
	void checkAge (int age) {
		if ( age <=  17) {
		throw new  ArithmeticException ("Not eligible for the voting");
		} else {
			System.out.println("Eligible for the voting");
		}
		
	}

	public static void main(String[] args) {
       // object of the class 
		Example6 obj = new Example6 ( );
		obj.checkAge( 19);
		System.out.println("End of application ");
		
		
	}

}
