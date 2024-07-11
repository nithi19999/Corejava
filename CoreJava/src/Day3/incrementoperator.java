package Day3;

public class incrementoperator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		/*int a=10;
		a++;
		System.out.println(a);
		//a++;		//it wont increment the 10 value
		 */
		
		//post increment
		int a=10;
		int result = a++;
		System.out.println(result);//it will prin t 10 only 
		//why bcz the "a" will be assign to "result" variable first
	//then it will increment 
		System.out.println(a);
		
		//post increment
		
		a=12;
		int res = ++a;
		System.out.println(res);
	}
	
}
