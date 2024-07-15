package Day9;

public class StringvsStringBuildervsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";
		s.concat("to java");
		System.out.println(s);//immutable can't change
		
		//
		StringBuffer str =new StringBuffer("welcome");
		str.append("to java");
		System.out.println(str);// mutable can change 
		
		
		//
		StringBuilder str1 =new StringBuilder("welcome");
		str1.append("to java");
		System.out.println(str1);// mutable can change 
		

	}

}
