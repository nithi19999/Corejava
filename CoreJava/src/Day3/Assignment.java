package Day3;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=20, b=10;
		 
		 // with using third variable
		 
		/* System.out.println("Before swapping :"+" "+a+" "+b);
		 int c = a;
		 b=c;
		 a=b;
		 System.out.println("After swapping :"+" "+a+" "+b);*/
		 
		// without  using third variable
		 
//		 a=a+b;//a=20+10=30		a=30
//		 b=a-b;//b=30-10=20		b=20
//		 a=a-b;//a=30-20=10		a=10
//		 
//		 System.out.println("After swapping :"+" "+a+" "+b);
		 
		 //exple 3
		 
//		 a=a*b;
//		 b=a/b;
//		 a=a/b;
//		 System.out.println("After swapping :"+"a value is: "+a+" b value is:"+b);
		 
		 //exple 4
//		 
		 b=a+b-(a=b);
		 System.out.println("After swapping :"+"a value is: "+a+" b value is:"+b);
		 

	}

}
