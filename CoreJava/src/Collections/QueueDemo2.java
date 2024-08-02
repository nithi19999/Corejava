package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList pq=new LinkedList();
		
		pq.add("A");
		pq.add("B");
		pq.add("c");
		pq.offer("1");//heterogineos  allowed in LinkedList and aloso duplicate allowed
		pq.offer("1");
		System.out.println(pq);//[A, B, c, 1, 1]
		
		//remaining all the methods are same as PriorityQueue

	}

}
