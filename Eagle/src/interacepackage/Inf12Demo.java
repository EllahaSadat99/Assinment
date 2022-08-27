package interacepackage;

public class Inf12Demo implements Inf2 {
	
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I can take my own route");
	}

	
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("You should follow the ditection");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf2 obj = new  Inf12Demo ( );
		obj.method1();
		obj.method2();
		obj.uberMap();
     
	}
}

