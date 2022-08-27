package exceptionExample;

public class Example9 {
	
	int division ( int a , int b ) throws ArithmeticException {
	int d = 	a/b; 
		return d ; 
	}

	public static void main(String[] args) {
		Example9 obj = new Example9 ( );
		obj.division (12,0);
		
	}

}
