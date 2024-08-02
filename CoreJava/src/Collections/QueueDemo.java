package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("c");
		pq.offer("1");//heterogineos not allowed in priority Quue
		
		System.out.println(pq);//[A, B, c, E]// insertion order preserve and duplicates allowed
		
		//get Head element Element() and peek();
		
		//System.out.println(pq.element());//A(returns header elemet)// when queue ois empty it will throw No such element exception
		
		//System.out.println(pq.peek());//A(returns header elemet)//null(wehen queue is empty )
		
		//return and remove remove(), poll();
		
		//System.out.println(pq.remove());//A return// when queue empty nosuch element exce
		//System.out.println(pq);//[B, E, c]  A is removed 
		
		//System.out.println(pq.poll());// B return // when queue is empty throw null
		//System.out.println(pq);//[E, c]
		
		
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());//A,B,c,E
		}
		
		for(Object x:pq) {
			System.out.println(x);////A,B,c,E
		}
		
		
		
	}

}
