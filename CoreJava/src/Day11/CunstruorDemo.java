package Day11;

public class CunstruorDemo {
	int x,y;
	
	CunstruorDemo()// defalut constructor
	{
		x=100;
		y=200;
	}
	CunstruorDemo(int a,int b)// parametrised  constructor
	{
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CunstruorDemo sd=new CunstruorDemo();// defalut constructor invoked
		//sd.sum();//300
		
		
		CunstruorDemo sd=new CunstruorDemo(10,20);
		sd.sum();//30  // invoked parametrised  constructor
		
	}

}
