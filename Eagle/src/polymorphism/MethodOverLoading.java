package polymorphism;

public class MethodOverLoading {
	
	static int multiply ( int a , int b ) {
		return a*b;
		
	}
	static double multiply ( double a, double b) {
		return a*b; 
		
	}
	static double multiply ( double a , double b, double c) {
		return a*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodOverLoading.multiply(2,2));
		System.out.println(MethodOverLoading.multiply(2.5, 2.5) );
		

	}

}
