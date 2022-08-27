package classobject;

public class City {
	
	String name ; 
	int population ; 
	
	public void display () {
		System.out.println("city name : " + name);
		System.out.println("populaion :" + population);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City metro1;
		 metro1 = new City ();
		 metro1.name = "Kabul";
		 metro1.display();
		 
		 System.out.println("Kabul is a beautiful city");
		
		 
		
		
	}

}
