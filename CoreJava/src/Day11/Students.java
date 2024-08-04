package Day11;

public class Students {
	
	int sid;
	String sname;
	char grade;
	
	void printStudentData() {
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void setStudentdata(int sid,String name, char grade) {
		// local variables(user defined method)
		//setStudentdata storing the data into class varibles(global varia)
		this.sid=sid;
		this.sname=name;
		this.grade=grade;// when local varible and global variables names or same use this keyword 
	}
	
	Students(int sid,String name, char grade){
		this.sid=sid;
		this.sname=name;
		this.grade=grade;
	}
}


