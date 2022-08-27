package exceptionExample;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
			 int num = Integer.parseInt("=====" );
				System.out.println(num);
		} catch (Exception e) {
			System.out.println( "number format Exception ");
		}

	}

}
