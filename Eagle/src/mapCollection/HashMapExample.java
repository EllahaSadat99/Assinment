package mapCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer , String> hmap = new HashMap  <Integer , String> ();
		System.out.println("*******" + hmap);
		
		hmap.put(1,  "Jasmine1");
		hmap.put(2,  "Jasmine2");
		hmap.put(3,  "Jasmine3");
		System.out.println("**********" + hmap);
		
		Set set = hmap.entrySet() ;
		Iterator iterator = set.iterator ();
		while (iterator.hasNext()) {
			Map.Entry mapEntry ;
		}
		
		


	}

}
