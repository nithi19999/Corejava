//Method will perform certain task all predefined(Built in )  methods will belongs to string class
//

package Day8;

import java.util.Arrays;

public class Strings {
	
	//int a=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s=new String("nithi avru");
		//String s="welcome";
		//System.out.println(s);
		
		//length() - returns length of a string( NUmber of characters)
		String s="bbhhhh";
				System.out.println(s.length());
				System.out.println("nitheesh".length());		//8
				
				
				// concat() -joining Strings 
				
				String s1="jdhfyugry";
				String s2="nithi";
				String s3="avru";
				System.out.println(s1+s2);//jdhfyugrynithi
				System.out.println(s1.concat(s2));		//jdhfyugrynithi
				System.out.println(s1.concat(s2).concat(s3));//jdhfyugrynithiavru
				
				System.out.println("welcom".concat("nnnnnn").concat("ehuhefugieg"));//welcomnnnnnnehuhefugieg
				
				
				//trim()--- remove spaces left and right
				
				 s="       welcone";
				 System.out.println(s);
				 System.out.println(s.trim());
				 
				 
				 //charAt()---extract the character from the string
				 
				 s="welcome";
				 System.out.println(s.charAt(0));	//w
				 
				 
				 //contains-- will return true or false check the character whether its there in string  or not
				 //check string isthe part of main string or not
				 System.out.println(s.contains("wel"));//true
				 
				 //Equal()-(case senstive lower and uppers matters ) , equalIgnoreCase()--compare strings
				 // equalIgnoreCase()---case insensitive (It will treat lower and uppper case are same ) 
				 
				 s1="welcome";
				 s2="welcome";
				 System.out.println(s1.equals(s2));	//true
				 System.out.println(s1==s2);//true
				 
				 System.out.println(s1.equalsIgnoreCase("Welcome"));// true
				 System.out.println(s1.equals("Welcome"));// false
				 
				 
				 //replace-- it will replace multiple(sequance) or single character in string
				 
				 s=" welcome java string pyton c#";
				 System.out.println(s.replace('a', 'x'));//welcome jxvx string pyton c#
				 System.out.println(s.replace('w', 'z').replace('t', 'x'));// zelcome java sxring pyxon c#
				 System.out.println(s.replace("welcome","nithi"));		//nithi
				 
				 
				 //substring()--extract  substring from the main string
				 //Starting index start from-- 0
				 // ending index start from--- 1
				 
				 s=("welcome, vidya");
				 System.out.println(s.substring(0, 3));//wel
				 System.out.println(s.substring(3, 7));//come
				// System.out.println(s.substring(31, 7));//java.lang.StringIndexOutOfBoundsException
				 
				 //toUppercase()  --- toLowerCase()
				 
				 s="weclome";
				 
				 System.out.println(s.toUpperCase());//WECLOME
				 System.out.println(s.toLowerCase());//weclome
				 
				 
				 //split()----Split the string into multiple parts based on delimeter
				 
				  s="nitheesh@gmail.com";
				  String a[]=s.split("@");	
				  System.out.println(Arrays.toString(a));	//[nitheesh, gmail.com]
				  System.out.println(a[1]);					//gmail.com
				  System.out.println(a[0]);					//nitheesh
				 
				  
				  //exaple 1
				  String update = "$,23,45";
				  System.out.println(update.replace("$", " "));		//,23,45
				  System.out.println(update.replace(",", ""));		//$2345
				  System.out.println(update.replace("$", "").replace(",", ""));//2345	
				 
				 //ex 2
				  s="adc,123@xyz";		//abc 123  xyz(, and @ is the delimeter)
				  String arr[]=s.split(",");
				  System.out.println(Arrays.toString(arr));	//[adc, 123@xyz]
				  
				  //we cant use *  % ^ & ( ) as delimeters
				  
				    s="Nithi avru";
				  //i want check nithi is part of main string or not 
				  System.out.println(s.contains("nithi")); // false
				  System.out.println(s.contains("Nithi"));	//true
				 
				  // i want to make it true without equalignorecase
				  System.out.println(s.replace('N', 'n').contains("nithi"));	//true
				  System.out.println(s.toLowerCase().contains("nithi"));		//true
				 
	}

}
