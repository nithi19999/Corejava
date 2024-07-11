package Day5;

public class Countthenoofdigitis {

	public static void main(String[] args) {
		int num=12344;
		
		int count = 0;
		while(num>0) {			// num!=0 also fine
			
			num=num/10;
			count++;
		}
		System.out.println("number of digits:"+count);
		
		
		
		

	}
}
