package Day9;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a string");
		String str=sc.next();
		String orgstring=str;
		//String s="madim";
		
		String rev= "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(orgstring+ "its a palindome");
		}
		else {
			System.out.println(orgstring+ "not");
		}
			
		
		
		
	}

}
