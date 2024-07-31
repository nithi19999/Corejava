package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//HashSet hs=new HashSet();//default capacity 16 and load factor is 0.75
		
		//HashSet hs=new HashSet(100);//initial capacity 100
		
		//HashSet hs=new HashSet(100,(float)0.90);
		//HashSet<Integer>hs=new HashSet<Integer>();
		
		HashSet hs=new HashSet();
		
		//Add object or element into hashSet
		hs.add(100);
		hs.add(20);
		hs.add('a');
		hs.add("devru");
		hs.add(null);
		
		System.out.println(hs);//[null, a, 100, 20, devru](insertion order not preserve)
		
		//remove
		hs.remove(20);
		System.out.println(hs);//[null, a, 100, devru]
		
		//congtains
		
	
		System.out.println(hs.contains(null));//true
		
		//isempty
		
		System.out.println(hs.isEmpty());//false
		
		//reading elements or objects from using for each looop
		
		for(Object x:hs) {
			System.out.println(x);//[null, a, 100, devru]
		}
		
		//Iterator
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());////[null, a, 100, devru]
		}
		
		
		

	}

}
