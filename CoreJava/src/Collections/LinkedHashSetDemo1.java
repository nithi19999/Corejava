package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet lhs=new HashSet();
		//LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(11);
		lhs.add(50);
		lhs.add(100);
		lhs.add(12);
		System.out.println(lhs);//[10, 11, 50, 100, 12] insertion order preserve

	}
}
