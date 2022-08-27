package dailyPractice;

public class Loin extends Animal {

	@Override
	void move() {
		System.out.println("all loin move by thier feet");
	}

	@Override
	String eat() {
		return "Loins eat meatl";
	}

	@Override
	int legs() {
		return 4;
	}
	

}
