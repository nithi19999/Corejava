package Day10;
//import Day1.FirstDay; when u want access other package

public class EmployeesMain {

		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.empid=101;
		emp.empsal=1000;
		String empp = emp.empname;//nithi
		//System.out.println(emp.empid);//101
		emp.display();//101
						//1000
						//null
		
		//Employee emp1=new Employee();
		
		//emp1.empid=111;
		//emp1.display();
	}

}
