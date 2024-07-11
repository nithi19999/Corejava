package Day5;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		 int num=sc.nextInt();
		 
		 int rev=0;
		 int oringinal_no = num;
		 while(num!=0) {
			 rev=rev*10+num%10;//1,10+2=20,200+1=201,
			 num=num/10;//12,1,0
		 }
		 if(oringinal_no==rev) {
			 System.out.println(oringinal_no+"its a polindrome");
		 }
		 else {
			 System.out.println(oringinal_no+"Not a Polindrome");
		 }

	}

}
