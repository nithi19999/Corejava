package InstagramCodes;


	class Animal{
		public void sound() {
			System.out.println("any sound ");
		}
	}
	
	class Dog extends Animal{
		public void sound() {
			System.out.println("bow bow ");
		}
	}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog bb = new Dog();
		bb.sound();//bow bow

	}

}
