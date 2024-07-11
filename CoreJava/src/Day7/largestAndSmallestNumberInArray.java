package Day7;

public class largestAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,67,1};
		int largest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)			// for smallest  '<'
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
