package Day5;

public class BreakStatement {

	public static void main(String[] args) {
		/*int a=10;
		for(int i=a;i>0;i--) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}*/
		
				//continue statement 
		int a=10;
		for(int i=a;i>0;i--) {
			if(i==5||i==3||i==10) {//o/p:9876421
				continue;// once contion is satisfied control will go to increment 5-1 4 will be print
			}
			/*if(i==3) {
				continue;
			}
			if(i==9) {
				continue;//here i'm skipping 3,5,9
			}*/
			System.out.println(i);// output 10,9,8,7,6,4,3,2,1
		}

	}

}
