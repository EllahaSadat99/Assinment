package dailyPractice;

public class AllAnimals {

	public static  void main(String[] args) {
		
		Bird theBirds = new Bird();
		theBirds.move( );
		System.out.println(theBirds.eat());
		System.out.println(theBirds.legs());
		
		
		Loin theLoin = new Loin ( );
		theLoin.move ( );
		System.out.println(theLoin.eat());
		System.out.println(theLoin.legs());
		
		

	}

}
