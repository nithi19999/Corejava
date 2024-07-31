package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Deomo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("e");
		al.add("a");
		al.add("z");
		System.out.println(al);//[a, a, a, a, a]
		
		ArrayList all_demo=new ArrayList();
		all_demo.addAll(al);
		System.out.println(all_demo);//[a, a, a, a, a]
		
		all_demo.removeAll(all_demo);
		System.out.println(all_demo);//[]
		
		// sor -----collections.sort()
		
		System.out.println("elemts in the arrayLst"+al);//elemts in the arrayLst[a, b, e, a, z]
		Collections.sort(al);
		System.out.println("sorted Array"+al);//sorted Array[a, a, b, e, z]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("sorted in reverce order"+al);//sorted in reverce order[z, e, b, a, a]
		
		
		//Shuffleing Collections.Shuffliong()
		
		Collections.shuffle(al);
		System.out.println("After Shuggling "+al);//After Shuggling [b, a, e, z, a]
		
		

	}

}
