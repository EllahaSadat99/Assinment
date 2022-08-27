package setCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet <String> lhset = new LinkedHashSet <String> ();
		System.out.println("***************" +  lhset );
		
		lhset.add("A");
		lhset.add("b");
		lhset.add("c");
		lhset.add("d");
		System.out.println("=========="  + lhset);
		
		
		LinkedHashSet <Integer> lhset1 = new LinkedHashSet <Integer> ();
		System.out.println(",,,,,,,,,,,,,,,,,," + lhset1);
		
		lhset1.add(1);
		lhset1.add(4);
		lhset1.add(5);
		lhset1.add(3);
		
		System.out.println("<<<<<<<<<<<<<" + lhset1);
		
		
		
		
		

	}

}
