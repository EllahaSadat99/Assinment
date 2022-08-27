package methods;

public class MyEmployee {
	
	static int  id = 01;
	 static String name = "Ahmad";
	String workhour;
	String hourlypayment;
	
	public static int showEmpolyeepayment (int hourlypayment , int workhour) {
		return hourlypayment * workhour;
		}
	public static void main(String[] args) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(showEmpolyeepayment(20,8));
		

	}

}
