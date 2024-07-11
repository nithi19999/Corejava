package Day5;

public class CountevenoddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123345;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {		// num!=0 also right
			int rem=num%10;
			if(rem%2== 0) {
				 even_count++;		//1+1
			}
			else {
				odd_count++;		//1+
			}
			
			num=num/10;				//12334,1233,123,12,1,0
		}
		
		System.out.println("evene numbers count:"+even_count);
		System.out.println("odd numbers count:"+odd_count);

	}

}
