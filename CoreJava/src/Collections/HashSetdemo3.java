package Collections;

import java.util.HashSet;

public class HashSetdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set1=new HashSet();
		
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(1);
		System.out.println("hashset1"+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		
		set2.add(6);
		set2.add(4);
		set2.add(9);
		set2.add(10);
		System.out.println("hashset1"+set2);
		
		//Union
		
		//set1.addAll(set2);
		//System.out.println("union"+set1);//union[2, 4, 6, 8, 9]
		
		//INTERSECTION
		
		//set1.retainAll(set2);
		//System.out.println(set1);//[4, 6](common elements)
		
		
		//difference
		//set1.removeAll(set2);
		//System.out.println(set1);//[2]
		
		//subset
		
		set1.containsAll(set2);
		System.out.println(set1);//[2, 4, 6]
		
		System.out.println(set1.containsAll(set2));//false
		

	}

}
