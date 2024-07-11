package Day5;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="nithi";
		String rev=" ";
		int len = string.length();//5
		for(int i=len-1;i>=0;i--){
			rev=rev+string.charAt(i);
		}
		System.out.println(rev);
	}

}
