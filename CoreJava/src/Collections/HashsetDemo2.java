package Collections;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println(hs);//[2, 4, 6]
		HashSet<Integer> hs_new=new HashSet<Integer>();
		
		hs_new.addAll(hs);
		hs_new.add(10);
		System.out.println(hs_new);//[2, 4, 6, 10]
		
		
		//removeAll(0)
		
		hs_new.removeAll(hs);
		System.out.println(hs_new);//[10]
		
		
	}

}
