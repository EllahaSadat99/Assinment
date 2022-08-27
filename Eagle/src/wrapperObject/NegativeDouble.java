package wrapperObject;

public class NegativeDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dnum  = - 99.900;
		System.out.println("Double number befor conversion " + dnum);
		String str = String.format( "%f"  , dnum);
		System.out.println("Double NUmber after conversion : " +  str);

	}

}
