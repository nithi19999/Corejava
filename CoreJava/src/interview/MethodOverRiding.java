package interview;

class whtasapp_v1
{
	void status()
	{
		System.out.println("image");
	}
}
class whtasapp_v2 extends whtasapp_v1
{
	void status()
	{
		System.out.println("image,voice");
		//super.status();  when u wnat implementaion in super class
	}
}




public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		whtasapp_v2 w1=new whtasapp_v2();
		w1.status();
	}

}
