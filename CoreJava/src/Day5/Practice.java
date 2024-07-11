package Day5;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		//int num = sc.nextInt();
		System.out.println("Enter the number:");
		int num = sc.nextInt();*/
		
		/*int rev=0,num=121;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("reversed numebr is:"+rev);*/
			
			StringBuffer sb=new StringBuffer("nithi");
			StringBuffer rev = sb.reverse();
			System.out.println(rev);
			
			StringBuffer org = rev;
			if(org==rev) {
				System.out.println(org+"poli");
			}
			else {
				System.out.println(org+"not");
			}
			 
			
		
		/*StringBuilder sbl=new StringBuilder();
		StringBuilder rev = sbl.append("nithi");
		rev.reverse();
		System.out.println(rev);*/
		
		//int num = 201*10;
		//System.out.println(num);
		
			
	}

}
