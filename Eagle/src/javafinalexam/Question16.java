package javafinalexam;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer , String> stger = new HashMap  <Integer , String> ();
         System.out.println("Print The Employee  Names  : " + stger);
		
		stger.put(01, "Jasmine");
		stger .put(02,  "Anas");
		stger .put(03,  "Ahmad");
		stger.put(04,  "Sara");
		stger.put(01, "Samira");
		System.out.println("The Employee Names : " + stger );
		
      	Set name = stger .entrySet() ;
    	Iterator hash = name.iterator ();
 		while (hash.hasNext()) {
		Map.Entry mapEntry ;

	}

	}
}
