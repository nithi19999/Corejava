package Day9;

public class CountCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JAva programing java oops";
		
		int total_count=str.length();//total length// it is case sesitive
		System.out.println(total_count);//25
		
		int total_countAfterremovea = str.replace("j", "").length();// total lenghth after removinbg A's
		//System.out.println(total_countAfterremovea);//21
		
		
		//int count=total_count-total_countAfterremovea;
		//System.out.println("Number of accurence of a"+count);

	}

}
