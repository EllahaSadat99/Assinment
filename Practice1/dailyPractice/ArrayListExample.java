package dailyPractice;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj = new ArrayList <String>( ) ;
		
		obj.add("Jamila1");
		obj.add("Jamila2");
		obj.add("Jamila3");
		obj.add("Jamila4");
		obj.add("Jamila5");
		
		System.out.println(obj);
		
	for (String school : obj) {
		System.out.println("\n" + school);
		
		obj.remove("Jamila4");
		for (String str : obj) {
		System.out.println("name : " + str);
		System.out.println();
		obj.add("Jamila8");
		for (String str1: obj) {
		System.out.println(obj);
		
		System.out.println("/n ************");
		obj.remove(1);
		for (String str2 : obj) {
		System.out.println("Name : " + str2);
		}
	}
	}
	
	}
	}
}
	
	
	
	
	
	
	
		
		
		

	


