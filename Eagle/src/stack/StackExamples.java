package stack;
import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> plates = new Stack <String> ();
		System.out.println("++++++++++++  " + plates);
		System.out.println("============  " + plates.size());
		// to add we use push
		plates.push("plate 1");
		plates.push("plate 2");
		plates.push("plate 3");
		plates.push("plate 4");
		plates.push("plate 5");
		plates.push("plate 6");
		System.out.println("***************  "+ plates);
		System.out.println("palte removed : " + plates.pop());
		System.out.println("palte removed : " + plates.pop());
		System.out.println("palte removed : " + plates.pop());
		System.out.println("palte removed : " + plates.pop());
		
		System.out.println("============: " + plates);
		System.out.println("get the plate : " + plates.peek());
		
		
		System.out.println("----------- : " + plates.search("plate 1"));
		
		

		

		

		
		

	}

}
