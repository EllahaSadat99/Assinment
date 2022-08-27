package interacepackage;

public class Demo implements  MyInterface {
	public void method1( ) {
		System.out.println("implementation of method1");
		
	}
	public void method2( ) {
		System.out.println("implementation of method2");
	}
	
	public void demoMethod ( ) {
		System.out.println("Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MyInterface obj = new  Demo();
		 obj.method1();
		 obj.method2();
		 obj.method3();
		 
		 Demo demo = new Demo() ;
		 demo.demoMethod();
		 


		 

	}

}
  