package Day5;
import java.util.Scanner;
public class Reverseanumber {
		public static void main(String[] args) {
			
			//Scanner sc=new Scanner(System.in);
			//System.out.println("enter the number:");
			//int num=sc.nextInt();
			
			//1. using algorithm
			
			/*int rev=0,number=1234;
		while(number!=0) {
			rev=rev*10 + number%10;//0*10=0 + 1234%10=4,  4*10=40 + 123%10=3
			number=number/10;//1234/10=123, 123/10=12,...
			//System.out.println(rev);0p:4,43,432,4321
		}
		System.out.println(rev);//4321
		}*/
			
			
			//2. using string buffer class
			
			/*StringBuffer sb=new StringBuffer(String.valueOf(1234));
			StringBuffer rev = sb.reverse();
			System.out.println("the reverse number is:"+rev);*/
			
			//3.stringBuilder classs
			
			StringBuilder sb=new StringBuilder();
			 //sb.append(1234);//true
			 StringBuilder rev = sb.append(1234);//true
			sb.reverse();
			System.out.println(rev);
			

	}
}