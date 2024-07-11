package Day7;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,400,500,444,333,555};
		
		System.out.println("before sorting...");
		System.out.println(Arrays.toString(a));
		
		
		
		System.out.println("After Sorting....");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
