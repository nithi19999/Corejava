package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataintoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
		System.out.println("Eneter the position"+i+":");
		a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
	}

}
