package autoboxingUnboxing;
import java.util.ArrayList;

public class UnboxingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arrayList = new ArrayList <Integer>();
		arrayList.add( 10);
		arrayList.add( 12);
		System.out.println(arrayList);
		
		int number = (int)arrayList.get(1);
		//int number1 = (int)arrayList.get(0);
		System.out.println(number);
		
		
		

	}

}
