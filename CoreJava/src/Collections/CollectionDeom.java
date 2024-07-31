package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDeom {

	public static void main(String[] args) {
		// Declare a arrayList
		
		//ArrayList al=new ArrayList();
		//ArrayList<String> al=new ArrayList<String>();
		//List al=new ArrayList();
		
		ArrayList al=new ArrayList();
		
		//add new element to array list
		//al.add(100);
		al.add("welcome");
		System.out.println(al);//[100, welcome]
		
		//size();
		System.out.println(al.size());//2
		
		//remove()
		
		//al.remove(1);
		//System.out.println(al);//[0][100] ([1]removed welcome) 
		al.remove("welcome");
		System.out.println(al);//[100]
		
		// insert new element
		al.add(1, "pyton");
		System.out.println(al);//[100, pyton] ( 
		
		
		// retrive a specific vlaue 
		
		//al.get(1);
		System.out.println(al.get(1));//pyton
		
		//set() change element or replace element
		
		al.set(1, "c#");
		System.out.println(al);//[100, c#]
		
		//searching contains 
		
		//al.contains("c#");
		System.out.println(al.contains("c#"));//true
		System.out.println(al.contains("C#"));//false
		
		//isEmpty
		
		System.out.println(al.isEmpty());// false
		
		
		//for loop
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));//c#
		}
		
		
		
	}

}
