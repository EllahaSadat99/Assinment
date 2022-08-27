package encapsulation;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student theStudents = new Student ( );
		theStudents.setName ( " Ahmad");
		theStudents.setId ( 3);
		theStudents.setAge ( 23);
		System.out.println("Name : " + theStudents.getName ( ));
		System.out.println("ID : " + theStudents.getId ( ));
		System.out.println("Age : " + theStudents.getAge ( ));
		
		
		

	}

}
