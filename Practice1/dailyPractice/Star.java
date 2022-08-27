package dailyPractice;

public class Star {
	public int ID;
	 public String Name;
	 public String Position;
	 
	public void Moon () {
		System.out.println("ID : " + ID);
		System.out.println("Name : " + Name);
		System.out.println("Positiion : " + Position);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star Sun= new Star ();
		Sun.ID = 02;
		Sun.Name = "Anas";
		Sun.Position = "Teacher";
		 Sun.Moon();
		 System.out.println();
		 
		
		
		
		
		
		
		

	}

}
