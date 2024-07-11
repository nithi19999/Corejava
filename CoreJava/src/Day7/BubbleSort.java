package Day7;

import java.util.Arrays;

public class BubbleSort {					

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,5,4,2,1};
		System.out.println("Before sorting.."+Arrays.toString(a));
		
		int n=a.length;
		for(int i=0;i<n-1;i++)			// number of passes
		{
			for(int j=0;j<n-1;j++)		//Iterations in each pass
			{
				if(a[j]>a[j+1])
				{
					int Temp=a[j];
							a[j]=a[j+1];
							a[j+1]=Temp;
				}
					
			}
		}
		
		System.out.println("After sorting.."+Arrays.toString(a));

	}

}
