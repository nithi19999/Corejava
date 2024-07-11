package Day7;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,3,45,6,7,6};
		int num=6;
		int count=0;
		boolean search=false;								// by default boolean valus eis false
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==num) {
				count++;
				System.out.println("found the number");		// if we us break as soon as found a number loop will exit 
				search=true;								//As soon as we found a number change search value to true so loop will exit using break;
				//break;										// if we don't use break loop will  repeating
				continue;
			}
				
			
		}
		System.out.println(count);
		if(search==false)									// if when number not found exit the loop search remains false print not found
			System.out.println("Number not found");
		
		// enhanced for lopp
		
		/*for(int x:a) {
			if(x==num) {
				System.out.println("found ");
				search=true;
				break;
			}
		}
		if(search==false) {
			System.out.println("Number not found");
		}*/

	}

}
