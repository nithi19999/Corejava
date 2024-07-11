//How to check the number is prime or not
// it should be devide by 1 or itself then it is prime number

package Day6;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1;
		int count=0;
		
		if(number>1) {
			for(int i=1;i<=number;i++) {
				if(number%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("its a prime number");
			}
			else {
				System.out.println("the number is not a prime number");
			}
			
		}
		
		else {
			System.out.println("Nit a prime Number");
		}
	}

}
