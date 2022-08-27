package stringBufferBulder;

public class Performance {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		
		StringBuffer sbuffer = new StringBuffer ( "TEK") ;
		for ( int i = 0 ; i < 60000; i ++)
			sbuffer.append( " Dojo");
		System.out.println(" Time consumed by StringBuffer : " + (System.currentTimeMillis()  - startTime ) + " millisecond");
		
		
		
		
		
		
		
		
		System.out.println(startTime);

	}

}
