

public class Students {
	
	public String name;
	public String lastName;
	public int ID;
	// creating constructor
public Students(String name, String lastName, int iD) {
		
		this.name = name;
		this.lastName = lastName;
		this.ID = iD;
}
	public String Study () {
		return "Intalligent student";
		
	}
	
	public  String Write () {
		return "Beautiful Hand Writing" ; 
		
	}
	public static void main(String[] args) {
      // create object 
		Students object = new Students ("Mahmood", "Ahmadi",29) ;
		System.out.println("Name : " + object.name);
		System.out.println("Last Name : " +object.lastName);
		System.out.println("ID : " + object.ID);
		
		System.out.println(object.Study ());
		System.out.println(object.Write ());
		

	}
}




