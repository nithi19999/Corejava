package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		String arr[]= {"nithi","love","god"};
		
		for(String value:arr) {
			System.out.println(value);// 
		}
		
		ArrayList al =new ArrayList(Arrays.asList(arr));//conver array to arralist
		System.out.println(al);//[nithi, love, god]

	}

}
