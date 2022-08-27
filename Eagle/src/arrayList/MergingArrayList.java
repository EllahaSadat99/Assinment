package arrayList;
import java.util.ArrayList;

public class MergingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> all = new ArrayList <String>();
		 all.add("Apple1");
		 all.add("Apple2");
		 all.add("Apple3");
		 all.add("Apple4");
		 System.out.println(all);
		 
			ArrayList <String> all2= new ArrayList <String>();
			
			 all.add("Apple11");
			 all.add("Apple12");
			 all.add("Apple13");
			 
			 System.out.println(all2);
			 
			 all.addAll(all2);
			 System.out.println(all);
			 
			// all2.addAll(all);
			// System.out.println(all2);
			 
			 all.addAll(2,all2);
			 System.out.println(all);
			 
			 all.remove(0);
			 System.out.println(all);
			 
			 
			 
		 
		 

	}

}
