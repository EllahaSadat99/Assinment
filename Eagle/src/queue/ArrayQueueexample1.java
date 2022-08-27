package queue;
import java.util.Deque;
import java.util.ArrayDeque;



public class ArrayQueueexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque <String> dq = new ArrayDeque <String> (); 
		dq.push("Vijay");
		dq.push("Amad");
		dq.push("Jim");
		dq.add("Ravi");
		dq.push("Jon");
		System.out.println(dq);
		for (String name: dq) {
			System.out.println("Name : " + name);
			
		}
		
		dq.offer("Stave");
		System.out.println("============ : " + dq);
		dq.offerFirst("Zara");
		System.out.println("-----------" + dq);
		dq.offerLast("-------------");
		System.out.println("========= : " + dq);
		dq.pollLast();
		System.out.println("+++ : " +  dq);
		dq.pollFirst();
		System.out.println(",,,,,,,,,,,,,,, : " + dq);

	}

}
