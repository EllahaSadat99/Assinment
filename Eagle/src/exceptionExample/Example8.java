package exceptionExample;

public class Example8 {
	
	static void checkingEligiblity ( int studentAge, int studentWeight) {
		if ( studentAge < 12 && studentWeight < 40 ) {
			throw new ArithmeticException ( "student is not eligible to register") ;
		} else { 
			System.out.println("student entry is valid");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to the registration process");
		checkingEligiblity  ( 11,41);
		System.out.println("see you in tournament");
		
	}

}
