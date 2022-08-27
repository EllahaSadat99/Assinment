package arrayList;
import java.util.ArrayList;

public class ArrayIndexs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList <Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(8);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
		System.out.println(al);
		System.out.println(al.lastIndexOf(5));
		System.out.println(al.indexOf(5));
	
	}

}
