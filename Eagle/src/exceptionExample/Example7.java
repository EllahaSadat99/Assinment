package exceptionExample;

public class Example7 {
	
	static void myMethod (int testnum ) throws Exception {
		System.out.println("start - myMethod");
		if ( testnum == 18 )
			throw new Exception ();
		System.out.println("end - myMethod");
		
		return;
	}

	public static void main(String[] args) {
		int testnum = 18;
		try {

			System.out.println("try - first statement");
			 myMethod ( testnum );
			 System.out.println("last - statment ");
		} catch (Exception e) {
			System.out.println(" an exception");
			 
		}
        
	}

}
