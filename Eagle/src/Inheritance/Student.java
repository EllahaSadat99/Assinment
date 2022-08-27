package Inheritance;

public class Student extends Person {
	
	int marks = 89;
	String Lesson = "Java tutorial ";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student () ;
		obj.show();
		System.out.println("Name of student is  : "+ obj.name);
		System.out.println("Age of student is : "+obj.age);
		System.out.println(" student lives in : " +obj.city);
		System.out.println("=======================");
		System.out.println("properties of child class");
		System.out.println("student marks : " +obj.marks);
		System.out.println("student lesson :" +obj.Lesson);
		

	}

}
