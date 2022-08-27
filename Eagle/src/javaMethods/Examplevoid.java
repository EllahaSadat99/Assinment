package javaMethods;

public class Examplevoid {

	public static void main(String[] args) {
      // the void keyword allwos us to creat methods which do not return a value
		// calling the void method 
		voidMethod ();
		Examplevoid rM = new Examplevoid() ;
		String x = rM.returnMethod();
		System.out.println(x);
		
	}
	// void method
        public static void voidMethod () {
        	System.out.println("This is a print linr from void method ");
        }
        public static String returnMethod () {
        	// add a return statement
        	return "Here is a returning Method! ";
        }
}
