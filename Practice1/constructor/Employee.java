package constructor;

public class Employee {
	
	String name ; 
	String position ;
	int salary ;
	int age; 
	// to initialize our fields we need for constructor
	public Employee(String name, String position, int salary, int age) {
		
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.age = age;
	}
	 // create methods 
	public String helpCustomer () {
		return "Help them to pay thier doubt . " ; 
		
	}
	public String AnswercellPhone ( ) {
		return " Answer the customer qustion" ;
		
	}
	public String  Oprator ( ) {
		return "Answer Phone" ;
		
	}
	
	public String Oprator2( ) {
		return "Help customer" ;
		
	}
		

	

	public static void main(String[] args) {
		// create the object of the employee 
		Employee Oprator1 = new Employee ( "Ahmad" , "Assistant", 10000, 25);
				
		System.out.println("Name :   " + Oprator1.name);
		System.out.println("Position :  " + Oprator1.position);
		System.out.println("Salary :    " + Oprator1.salary);
		System.out.println("Age :       " +  Oprator1.age);
		
		System.out.println("Ahmad " +Oprator1.helpCustomer ());
		System.out.println("Ahmad "+Oprator1.AnswercellPhone ( ));
			
		
		System.out.println("===============");
		Employee Oprator2 = new 		Employee ( "Masoma" , "Oprator ", 20000, 35);
		
		System.out.println("Name : " + Oprator2.name );
		System.out.println("Oprator : " + Oprator2.position);
		System.out.println("Salary : " + Oprator2.salary);
		System.out.println("Age : " + Oprator2.age);
		System.out.println(Oprator2.Oprator ( ));
		System.out.println(Oprator2.Oprator2( )); 
		 			
		}
		}
	  
	
	
	


	
	
	

