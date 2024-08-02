package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Nithi");
		hm.put(106, "Ayojappa");
		hm.put(103, "Anjinappa");
		hm.put(104, "chandraprabha");
		hm.put(104, "K");//Order of insertion not preserved
		System.out.println(hm);//{101=Nithi, 102=Ayojappa, 103=Anjinappa, 104=Devaraja, 105=chandraprabha}
		System.out.println(hm);//when duplicate key is addded the same previous value will store({101=Nithi, 102=Ayojappa, 103=Anjinappa, 104=K})
		
		// get
		System.out.println(hm.get(106));//Ayojappa(retrive)
		
		//remove()
		System.out.println(hm.remove(101));//Nithi removed
		System.out.println(hm);//{103=Anjinappa, 104=K, 106=Ayojappa}
		
		//contains key
		
		System.out.println(hm.containsKey(104));//true
		System.out.println(hm.containsKey(101));//false
		
		//contains value
		
		System.out.println(hm.containsValue("K"));//true
		System.out.println(hm.containsValue("Kj"));//false
		
		//isEmpty
		
		System.out.println(hm.isEmpty());//false(if no data its return true)
		
		//I want retieve only leys from hashmap
		
		System.out.println(hm.keySet());//[103, 104, 106](Duplicate not allowed)returns a set of keys
		System.out.println(hm.values());//[Anjinappa, K, Ayojappa] returns a collections 
		
		//
		
		System.out.println(hm.entrySet());//[103=Anjinappa, 104=K, 106=Ayojappa]//(All entries, as set)
		
		// entry level When i want read each induvisual object
		
		for(int e:hm.keySet()) {
			System.out.println(e);
		}//103
		//104
		//106
		
		
		// values
		for(String v:hm.values()) {
			System.out.println(v);
		}//Anjinappa
		//k
		//Ayojappa
		
		for(Object i:hm.keySet()) {
			System.out.println(i+" :"+hm.get(i));
		}//103 :Anjinappa
		//104 :K
		//106 :Ayojappa

		//Entry interface methods when to work on specific entry
		//***************************************
		for(Map.Entry x :hm.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
		}//103  Anjinappa
		//104  K
		//106  Ayojappa
		
		
		//Iterator method
		
		
		Set s=hm.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}	//103    Anjinappa
			//104    K
			//106    Ayojappa

	}

}
