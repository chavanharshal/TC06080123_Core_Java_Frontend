package session_7;

public class Employee implements Cloneable{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public String toString() {
		return "Employee [empId=" +empId+ ", empName=" +empName+ "}";
	}
	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
			Employee e1=new Employee(111,"Rahul");
			System.out.println("e1= "+e1.empId+" "+e1.empName);
			Employee e2=(Employee) e1.clone();
			System.out.println("e2= "+e2.empId+" "+e2.empName);
		}
}

