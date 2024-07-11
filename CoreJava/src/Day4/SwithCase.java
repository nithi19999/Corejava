package Day4;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=8;
		switch(day) {
		case 1: System.out.println("Sunday"); break;// if we dont have break it will execute the next statement also
		case 2: System.out.println("MOn"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default:System.out.println("not a week");
		}

	}

}
