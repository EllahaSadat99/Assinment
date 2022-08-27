package exceptionExample;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(a[0] );
		
		try {
			int a [] = new int [ 15 ];
			a [11] = 12;
			System.out.println("the index value is : " + a[11]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Array index outofbound Exception" );
		}

	}

}
