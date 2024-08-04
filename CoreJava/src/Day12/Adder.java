package Day12;

////@MethodOverloading
public class Adder {
	
	int a=10,b=20;
	void sum() {
		System.out.println(a+b);
	}
	
	
	void sum(int x,int y) {
		System.out.println(x+y);
	}
	
	void sum(int x,String y) {
		System.out.println(x+y);
	}
	
	void sum(String x,int y) {
		System.out.println(x+y);
	}
	
	void sum(String x,int y,int z) {
		System.out.println(x+y+z);
	}


}
