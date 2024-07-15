package Day9;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="welcome";
		//String rev="";
		
		/*for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		
		//onother method without using string methods
		
		
		/*char a[]=s.toCharArray();		//toCharArray() it will convert string to array
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		StringBuilder s=new StringBuilder("devru");
		s.reverse();
		System.out.println(s);
		
		StringBuffer n=new StringBuffer("nithi");
		n.reverse();
		System.out.println(n);
		
	}

}
