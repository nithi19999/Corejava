package interview;

class Whatsapp
{
	// static void send(int no,String name) when static
	void send(int no,String name) {  // non static
		System.out.println(no+name);
	}
	void send(int no) {
		System.out.println(no);
	}
	void send(String name,int no) {
		System.out.println(name+no);
	}
}





public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whatsapp wa=new Whatsapp();// if to access non sattic creat object
		
		//wa.send(123);
		//wa.send("nithi",+123);
		wa.send(123,"avru");  // non sattic    
		//Whatsapp.send(123,"avru");   when static
		
		/*int[] a = new int[4];
		a[0]=10;
		System.out.println(a[5]); 	//java.lang.ArrayIndexOutOfBoundsException:*/
	}

}
