package mapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SortingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hmap = new HashMap <Integer, String>();
		 
		hmap.put(1,  "A");
		hmap.put(2, "C");
		System.out.println("===========");
		//Set set = hmap.entrySet();
	// 	Iterator iterator = set.iterator();
		
		boolean flag = hmap.containsKey(2);
		System.out.println("===========" + flag);
		boolean flag1 = hmap.containsKey(3);
		System.out.println("=============" + flag1);
		

	}

}
