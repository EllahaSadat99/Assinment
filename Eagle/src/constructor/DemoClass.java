package constructor;

public class DemoClass {
	// this class will demonstrate the constructor of overloading 
	
	int val1;
	int val2;
	
	// no arg constructor
	DemoClass () {
		val1 = 10;
		val2 = 20; 
		System.out.println("Demo from no arg constructor");
	}
		DemoClass (int num1) {
			val1 = num1;
			val2 = num1;
		
	}
		DemoClass (int num1, int num2) {
			val1 = num1;
			val2 = num2;
			System.out.println("Demo class with one argument ");
		}
		
			public void display () { 
				System.out.println("val1: " + val1 + "              val2: " + val2);
				
		}
		
	public static void main(String[] args) {

		DemoClass d1 = new DemoClass ();
		d1.display();

	}

}
