package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable ht=new Hashtable();// capacity 11 ,load factor 0.75
		
		//Hashtable t=new Hashtable(30);
		
		//Hashtable t=new Hashtable(30,0.95);
		
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101, "n");
		t.put(102, "s");
		t.put(103, "avru");
		t.put(104, "evru");
		//t.put(null,"x");//nullpointer excception bcz it dont allow null keyand null value
		
		System.out.println(t);//{104=200, 103=100, 102=s, 101=n}//insertion order not preserved
		
		//remaining methods are same 
		t.remove(101);
		System.out.println(t);//{104=200, 103=100, 102=s}
		
		//contqins key//contqimns value//isempty//
		
		//get all the keys //keyset();
		//values 
		
		//keyset
		for(int x:t.keySet()) {
			System.out.println(x+" "+t.get(x));
		}//104 200
		//103 100
		//102 s
		
		//Entry specific methods 
		
		for(Map.Entry x :t.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
		}//104  200
		//103  100
		//102  s
		
		//Iterator method
		
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}//104 evru
		//103 avru
		//102 s
		
		
	}

}
 