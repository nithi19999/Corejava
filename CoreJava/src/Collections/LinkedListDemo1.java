package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		
		//Add Elemenet to LInkedList
		
		l.add("Devru");
		l.add(100);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);//[Devru, 100, A, true, null]
		System.out.println(l.size());//5
		
		//remove
		
		l.remove(3);
		System.out.println("after removing"+l);//[Devru, 100, A, null]
		
		l.remove("Devru");
		System.out.println(l);//[100, A, null]
		
		//insert /adding e;ement in the middle of the Liknked List
		
		l.add(1, "nns");
		System.out.println(l);//[100, nns, A, null]
		
		//retriving the value
		
		System.out.println(l.get(1));//nns
		
		//change the vlaue
		
		l.set(0, 200);
		System.out.println(l);//[200, nns, A, null]
		
		//contains 
		
		System.out.println(l.contains("nns"));//true
		System.out.println(l.contains("nnssss"));//false
		
		//isempty
		
		System.out.println(l.isEmpty());//false
		
		//Reading elements //Reading elements from linkedList using for loop
		
		/*for(int i=0;i<l.size();i++) {
			System.err.println(l.get(i));
		}*/
		
		
		//for each loop
		
		for(Object x:l)
		{
			System.out.println(x);
		}
		
		
		//iterator() method 
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//200...
		}
		
		//AddAll()--- add all the objects to another LinkedList
		//removeall(); same as above
		// sort---Collectons.sort();
		//Collections.sort(l,collections.revrseorder());
		//Collections.Shuffule();
		
		//Special methods spefific methods of LinkedList
		//addFirst();,addLast();
		//getFirst();,getLast();
		//removeFirst();,removeLats();
		

	}

}
