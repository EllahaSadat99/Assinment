package arrayList;
import java.util.ArrayList;

public class SortingArrayList {

	public static void main(String[] args) {
       // sorting Array 		
		
		ArrayList < String > fruit = new ArrayList  < String > ( );
		
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange");
		
		System.out.println(fruit);
		for (String str : fruit) {
			System.out.println(str + " ");
			
			
			// 
			System.out.println();
			Collections.sort( fruit);
			
			
			
			
			
		}
		
		
		
		
		

	}

}
