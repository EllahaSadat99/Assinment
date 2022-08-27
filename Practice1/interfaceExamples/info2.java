package interfaceExamples;

public interface info2 extends info1,info3 {
	
	
	void method2();
	
	public default void class2 () {
		System.out.println("20 students are in class2");
	}
	

}
