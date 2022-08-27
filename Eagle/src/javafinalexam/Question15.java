package javafinalexam;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet <String> st= new LinkedHashSet <String> ();
		
     	st.add("One");
		st.add("Two");
		st.add("Three");
		st.add("Four");
		
		System.out.println("The First Five Number is : ");
		
		Iterator <String> tor= st.iterator();
	
		while (tor.hasNext()) {
			System.out.println(tor.next());
			
			
		}
		

	}

}
