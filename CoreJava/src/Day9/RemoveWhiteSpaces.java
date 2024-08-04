package Day9;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str=" java promgra   ming";
		
		str=str.replaceAll("\\s", "");
		
		System.out.println(str);//javapromgraming
	}

}
