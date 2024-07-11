package Day7;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// value should be in range 
		//no need order 
		//should not have duplicates
		
		int a[]= {1,2,3,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=1;i<=9;i++) {
			sum1=sum1+i;
		}
		
		System.out.println(sum1);
		System.out.println("missing number is:"+(sum1-sum));
		

	}

}
