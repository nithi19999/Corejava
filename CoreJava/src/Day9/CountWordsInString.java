package Day9;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name is Nithi Avru";
		int count = 1;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println("Number of words in a String is:"+count);//Number of words in a String is:5

	}

}
