package queue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;


public class QueueIntegerFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Integer> qobj = new  LinkedList  <Integer>  ( );
		qobj.add(1);
		qobj.add(3);
		qobj.add(4);
		qobj.add(1);
		qobj.add(5);
		qobj.add(1);
		System.out.println("+++++++++++ : " + qobj);
		System.out.println("+++++++++++ : " + qobj.size());


		

	}

}
