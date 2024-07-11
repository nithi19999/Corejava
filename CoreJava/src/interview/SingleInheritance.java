package interview;

class A
{
	int a=10;
	void dippaly()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=1000;
	void show()
	{
		System.out.println(b);
	}
}



public class SingleInheritance {
	
	public static void main(String[]args)
	{
		B ob=new B();
		ob.show();
		ob.dippaly();
		
	}

}
