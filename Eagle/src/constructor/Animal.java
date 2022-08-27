package constructor;

public class Animal {
	int legs;
	String sound; 
	
	 Animal (int legs, String sound) { 
		 this.legs = legs;
		 this.sound = sound;
		 
	 }
	 void display () { 
		 System.out.println("This is the class of edogs *** ");
		 System.out.println("legs are " + legs+ "sound is " + sound);
	 }

	public static void main(String[] args) {
// creating object of the class 
		Animal dog = new Animal (4, "bow bow");
		dog.display ();
		
		
	}

}
