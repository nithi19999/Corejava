package Day9;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="nithi";
		String s1="nithi";
		System.out.println(s==s1);//true  here cant c the diff when we create with new keyword
		System.out.println(s.equals(s1));//true
		
		String s3 =new String("nithi");
		String s4 =new String("nithi");
		
		System.out.println(s3==s4);		//false(to compare the objects )s3 is diff s4 is diff objests so false 
		System.out.println(s3.equals(s4));//true(to compare values of the objects )s3 value and s4 values same hence true
		
		
		//case 3
		String s5="abc";
		String s6=new String("abc");
		
		System.out.println(s5==s6);		//false
		System.out.println(s5.equals(s6));//true
		
		//case 4
		String s7="abc";
		String s8=new String("abc");
		 String s9 = s7;
		
		System.out.println(s7==s9);	//true bcz objects are same it comparing the object
		System.out.println(s7.equals(s8));//true
		
		
	}

}
