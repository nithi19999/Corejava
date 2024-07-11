package Day7;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayUsingBuiltinMethods {
	public static void main(String[]args) {
		//int a[]= {4,5,6,7,8,3,2,};
		
		//System.out.println("Before sorting"+Arrays.toString(a));
		
		/*Arrays.parallelSort(a);
		System.out.println("After sorting"+Arrays.toString(a));*/
		
		/*Arrays.sort(a);
		System.out.println("After sorting"+Arrays.toString(a));*/
		
		
		Integer a[]= {4,5,6,7,8,3,2,};			// here int is a premitivi type  not supporting for collection so we use Integer derived type 
		System.out.println("Before sorting"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting"+Arrays.toString(a));
	}

}
