package dailyPractice;

public class Class {
	
	int ID;
	String name; 
	String Students;
	int number; 
	
	public void grade () {
		System.out.println("The class Id is : " + ID);
		System.out.println("Name : " + name);
		System.out.println("She is intalligent :  " + Students);
		System.out.println("Number of class is : " + number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Class Grade7 = new Class () ;
	   Grade7.ID = 04;
	   Grade7.name = "Magabin";
	   Grade7.Students = "student";
	   Grade7.number = 12; 
	   
	  Grade7.grade();
	   System.out.println(Grade7);
	   
	   
		
		
			
		}

	}


