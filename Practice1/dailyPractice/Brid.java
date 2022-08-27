package dailyPractice;

public class Brid extends Animal {

	@Override
	void move() {
		System.out.println("Birds fly ");
	}

	@Override
	String eat() {
		return " all Birds eat beats" ;
	}

	@Override
	int legs() {
		
		return 2;
	}
	
	// implement all abstract method of animal class 
	  

}
