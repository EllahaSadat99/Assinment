package mapCollection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <Integer, String> hmap = new TreeMap<Integer, String>();
		
		hmap.put(1,  "value1");
		hmap.put(2,  "value2");
		hmap.put(3,  "value3");
		System.out.println("***********" + hmap);
		
		Set set = hmap.entrySet ();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry mentry = (Map.Entry)i.next();
			System.out.println(mentry);
			
		}
		
		
		

	}

}
