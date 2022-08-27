package queue;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <String> q = new LinkedList <String>( );
		
		System.out.println("Dsplaying Queue : " + q);
		System.out.println("======= : " + q.size());
		q.add("Jasmine1");
		q.add("Jasmine2");
		q.add("Jasmine3");
		q.add("Jasmine4");
	//	q.add(1);
		q.remove();
		
		System.out.println("Dsplaying Queue : " + q);
		System.out.println("======= : " + q.size());
		System.out.println("removing elements : " + q.remove());
		System.out.println("display Queue : " + q);
		// element 
		System.out.println("Head : " + q.element());
		// .poll();
		System.out.println("poll : " + q.poll());
		// peek ();
		System.out.println("Displaying Queue : " + q);
		System.out.println("peek : " + q.peek());
		System.out.println("+++++++++++++++++++++");
		// loop 
		for (String qlist : q) {
			
			System.out.println(qlist);
			
		}
 
		
		
		

	}

}
