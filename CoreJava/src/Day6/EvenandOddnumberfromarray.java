package Day6;

public class EvenandOddnumberfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		//System.out.print("evene numebrs");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even"+a[i]+"  ");
				
			}
				else {
					System.out.print("odd numbers"+a[i]+"   ");
				}
				
			}
		// enhamched for loop
		
		/*for(int x:a) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
			
		
		System.out.println("odd numebrs");
			/*for(int i=0;i<a.length;i++) {
				if(a[i]%2!=0) {
					System.out.println(a[i]);
			}
		}*/
		
		
		
		// enhamched for loop
		/*for(int x:a) {
			if(x%2!=0) {
				System.out.println(x);
			}
		}*/
		

	}

	}
