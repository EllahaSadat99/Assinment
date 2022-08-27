package javaMethods;

public class OverloadingMethod {
	
	public int sum (int x , int y) {
		return (x+y);
	}
		
		
	// over lood the sum method
		public int sum (int x , int y , int z) {
			return (x+y+z);
		}
			
			
			// overload sum method which takes different data
			public double  sum (double x , double y ) {
				return (x+y);
				
			}
			

	public static void main(String[] args) {
          // Drive dode
		// 
		OverloadingMethod result = new OverloadingMethod();
		// result.sum(2,2);
		System.out.println(result.sum(5, 2));
		
		
		System.out.println(result.sum(2, 2, 3));
		
		System.out.println(result.sum(3.5 , 3.5));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
