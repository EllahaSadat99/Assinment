package constructor;

public class MyClass {
	int x ;
	 MyClass (int i) {
		 x=i;
		 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyClass obj = new  MyClass ( 10);
		 MyClass obj2 = new MyClass ( 33);
		 
		 System.out.println(obj.x  + "   " + obj2.x);
	}
	
	}


