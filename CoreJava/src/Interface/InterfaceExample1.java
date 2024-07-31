package Interface;

public interface InterfaceExample1 {
	
	public static void hello() {
		System.out.println("helo nithi");
	}
	
	public class demo implements InterfaceExample1{
		//hello() virtually
		public void hi() {
			System.out.println("wtsapp");
		}
	}
	class mainclass{
		public static void main(String[]args) {
	demo de=new demo();
	de.hi();
		}
		
	}

}
