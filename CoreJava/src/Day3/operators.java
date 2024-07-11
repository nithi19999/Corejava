package Day3;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Airthmatic opertors
		 int a=12,b=34;
		 int c = a+b;
		 System.out.println("the value of c is:"+c);
		 System.out.println("the value of:"+(a-b));
		 System.out.println("the value of:"+(a*b));
		 System.out.println("the value of:"+(a/b)); //it will give the quotient  value 2/2=1
		 System.out.println("the value of:"+(a%b)); //reminder value ex:2%2= 0
		 
		 
		 
		 // realtional/comparission operators
		 //returns boolean value = true/false
		 
		 System.out.println(a>b);
		 System.out.println(a>=b);
		 System.out.println(a<b);
		 System.out.println(a<=b);
		 System.out.println(a!=b);
		 b=12;
		 System.out.println(a==b);
		  boolean res = a==b;		//if u want to store the value of boolean value the the reference variable should be boolean
		  System.out.println(res);
		  
		  //logical operators
		  //it will perform btwn 2 boolean values
		  
		  boolean x = true,	y=false;
		  
		  System.out.println(x&&y); //false
		  System.out.println(x||y);//true
		  System.out.println(!y);	//true
		  System.out.println(!x);	//false
		  
		  boolean b1 = 12>2;
		  System.out.println(b1);//
		  
		  boolean b2 = 12<34;
		  System.out.println(b2);//
		  
		  System.out.println(b1&&b2);
		  
		  System.out.println("combination of relational and logical opertaion is:"+((12>2)&&(10>1))+" "+b2);  //  combination of relational and logical opertaion
		  

	}

}
