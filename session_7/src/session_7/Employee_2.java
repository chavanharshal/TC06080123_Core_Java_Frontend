package session_7;

public class Employee_2 {
	private static int empNo;
	private static int salary;
	private static int totalSal;
	
	public Employee_2(int salary) {
		super();
		this.empNo=empNo;
		this.salary=salary;
		// this.empNo++;
		
		this.totalSal +=salary;
	}
	public void getDetails() {
		System.out.println("Employee = " +empNo+ " Total Salary = "+totalSal);
	}
	static {
		empNo = 60;
	}
	public static void main(String args[]) {
		Employee_2 e1 = new Employee_2(10000); 
		Employee_2 e2 = new Employee_2(20000);
		Employee_2 e3 = new Employee_2(30000);
		e1.getDetails();
	}
}