package queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeConstractor {

	int id , qauntity;
	String name, author,  puplisher;
	
	public ArrayDequeConstractor (int id , int qauntity, String name, String author, String puplisher) {
		this.id = id;
		this.qauntity = qauntity;
		this.name = name; 
		this.author = author; 
		this.puplisher = puplisher; 
		
	}

	public static void main(String[] args) {
       // ArrayDeque
		Deque <ArrayDequeConstractor> set = new ArrayDeque <ArrayDequeConstractor> () ;
		ArrayDequeConstractor book1 = new ArrayDequeConstractor (1, 1000, "Ahmad", "Mahbood", "Jasmine");
		set.add(book1);
		
		for (ArrayDequeConstractor book : set) {
			
			System.out.println ("ID : " + book1.id, "Qauntity : " + book1.qauntity, "Name : " + book1.name,
					                         "Author : "   + book1.author, "Puplisher :  " + book1.puplisher);
			
		}
		
	}

}
