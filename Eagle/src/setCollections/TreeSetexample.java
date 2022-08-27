package setCollections;

import java.util.TreeSet;

public class TreeSetexample {

	public static void main(String[] args) {
		
		TreeSet  <String> test = new 	TreeSet <String> ();
		System.out.println("1 ==============" + test);
		test.add("A");
		test.add("B");
		test.add("C");
		test.add("D");
		test.add("E");
		test.add("E");
		test.add("E");
		System.out.println("2  ****================" + test);
		System.out.println(test.size());
		
		TreeSet  <Integer> tes1t = new 	TreeSet <Integer> ();
		tes1t.add(1);
		tes1t.add(0);
		tes1t.add(2);
		tes1t.add(5);
		tes1t.add(4);
		tes1t.add(1);
		tes1t.add(1);
		System.out.println("3 ==================" + tes1t);
		System.out.println("6 ===========" + test.size());
		
		
		TreeSet  <Boolean> test2 = new 	TreeSet <Boolean> ();
		System.out.println("4 ==============" + test2);
		test2.add(false);
		test2.add(false);
		test2.add(true);
		test2.add(true);
		System.out.println("5 ================" + test2);
		System.out.println(" 7============ " + test.size());
		
		
		TreeSet  <String> test3= new 	TreeSet <String> ();
		System.out.println("===========" + test3);
		
	
		
		
		
		

	}

}
