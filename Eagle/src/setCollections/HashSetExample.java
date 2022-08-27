package setCollections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args) {
		// hashset declaration
		HashSet <String> hash = new HashSet <String> ();
		
		hash.add("apple1");
		hash.add("apple2");
		hash.add("apple3");
		hash.add("apple4");
		hash.add("apple5");
		hash.add("apple6");
		hash.add("apple7");
		hash.add("null");
		
		System.out.println("Displaying HashSet : " + hash);
		
		hash.add("apple2");
		System.out.println("After added duplicate elements : " + hash);
		
		hash.add(null);
		System.out.println("======" + hash);
		
		
		hash.clear();
		System.out.println("Display list : " + hash);
		
		Iterator loop = hash.iterator();
		while (loop.hasNext()) {
			System.err.println("*****" + loop.next());
		}
		
		

		
		

	}

}
 