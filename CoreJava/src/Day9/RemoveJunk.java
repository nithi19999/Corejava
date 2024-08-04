package Day9;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="!@#$%^&* nithi Avru 1117";
		
		//str.replaceAll(regukar exp , repalced exp)
		
		//String j = str.replaceAll("[]^a-zA-Z0-9]", "");
		//System.out.println(j);//!@#$%&* 
		
		 str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);//nithiAvru1117
		
		

	}

}
