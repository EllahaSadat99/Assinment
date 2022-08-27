package dailyPractice;

public class City {
	
	String name;
	double population; 
	int cities;
	
	public void Afghanistan () {
		System.out.println("Name of the city : " + name);
		System.out.println("populaion : " + population);
		System.out.println("The total cities are : " + cities);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City Kabul = new City () ; 
		City Herat = new City ();
		City Mazar = new City ();
		Kabul.name = "Kabul";
		Kabul.population = 1200.22;
		Kabul.cities = 54;
		
		Herat.name = "Herat";
		Herat.population = 45.6;
		Herat.cities = 34;
		
		Mazar.name = "Balkh";
		Mazar.population = 23.45;
		Mazar.cities = 67;
		
		
		System.out.println("Kabul city has");
		Kabul.Afghanistan();
		  System.out.println("==========================");
		Herat.Afghanistan();
		System.out.println("Herat is a beautiful city");
		System.out.println("===========================.");
		System.out.println("The greenest city.");
		Mazar.Afghanistan();
		
 
	}

}
