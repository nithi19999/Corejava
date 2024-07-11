package Day1;

public class FirstDay {
	public static void main(String[]args) {
		
		String s="jaanu";
		/*String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		FirstDay f1=new FirstDay();
		System.out.println(f1);	//Day1.FirstDay@13221655(Object Address)
		//StringBuffer sb=new StringBuffer(s);
		//System.out.println(sb.reverse());
		
		char a[]=s.toCharArray();
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
	}

}
