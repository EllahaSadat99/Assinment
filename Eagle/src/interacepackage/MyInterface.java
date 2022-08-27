package interacepackage;

public interface MyInterface {
	
	public void method1();
	public void method2();
	public default void method3() {
		System.out.println("Default method ");
	}
	
	

}
