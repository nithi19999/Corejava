package Day6;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a[][]=new int[3][2];
		a[2][1]=123;
		System.out.println(a[2][1]);*/
		
		// approch 2
		
		int a[][]={ {12,34},
				{23,45},{1231,34}
		};
		//System.out.println(a[1][0]);
		
		/*for(int r=0;r<=1;r++) {
			for(int c=0;c<=1;c++) {
				System.out.println(a[r][c]);
			}
			System.out.println();
		}*/
		
		//enhanced for loop
		
		for (int arrr[]:a){		// here we take single dimentional array(arr[]) to store multiple values
			for(int x:arrr) {
				System.out.print(x+"   ");
			}
			System.out.println();
	
	}

	}}
