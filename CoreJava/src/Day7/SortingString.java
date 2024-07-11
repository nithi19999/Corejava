package Day7;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"djkfhh","fggy","rjkhfriui","jgfg"};
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}

}
