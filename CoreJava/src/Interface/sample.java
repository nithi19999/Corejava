package Interface;

import Interface.sample;
import Interface.sample.demo;

public interface sample {
	
	public static void hello() {
		System.out.println("helo nithi");
	}
	
	public class demo implements sample{
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

// have doubt
