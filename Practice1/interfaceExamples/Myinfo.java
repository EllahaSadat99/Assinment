package interfaceExamples;

public class Myinfo implements info2 {
	
	public void method1() {
		System.out.println("the first method");
	}
	
	public void method2() {
		System.out.println("the second method");
		
	}
	public void method3() {
		System.out.println("the third method");
	}



	public static void main(String[] args) {
		 info2 Myinfo = new Myinfo ();
		 
		 Myinfo.method1();
		 Myinfo.method2();
		 Myinfo.class1();
		 Myinfo.class2();
		 Myinfo.method3();
		 
		 
		 
		 
		

	}

	
	
}
