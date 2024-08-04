package Day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Students st=new Students();
		
		// using object referance variable
		
		/*st.sid=101;
		st.sname="nithi avru";
		st.grade='A';
		
		st.printStudentData();//101 nithi avru A*/
		
		//using method
		
		//st.setStudentdata(101, "nithi", 'A');
		//st.printStudentData();//101 nithi A
		
		
		// 3) using constructor
		
		Students st=new Students(101, "nithiPrakash", 'A');
		st.printStudentData();//101 nithiPrakash A
		
		
	}

}
