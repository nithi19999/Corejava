package Day6;

public class FindSumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a[]= {1,2,3,4,5};
		int sum=0;
		//for(int i=0;i<=a.length-1;i++) {// a.lenghth-1=4   (0,1,2,3,4)
			//sum=sum+a[i]%10;
			//int num = a[i]/10;
			
			//or
			
			//sum=sum+a[i];// 5,4,3,2,1
			
		//}
		//System.out.println(sum);
		//or
		//System.out.println(sum);
	
	// Enhanced For loop
	
	for(int x:a) {
		
		  sum = sum+x;}
	System.out.println(sum);

	}
		

}
