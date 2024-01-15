package session_05;
	
public class Employee {
	private int empId;
	private String empName;
	
	public Employee() {}
	
	public Employee(int empId, String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public String toString() {
		return "Employee [empId=" +empId+ ", empName=" +empName+ "]";
	}
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if((this.empId == e.empId)  && this.empName.equals(e.empName))
			return true;
		else
			return false;
	}
	public static void main(String args[]) {
		Employee e1=new Employee(11,"harshal");
		Employee e2=new Employee(11,"harshal");
		
		/* if(e1==e2)
		 * { System.out.println("Are equal"); }
		 * else  System.out.println("Are not equal");
		 */
	if(e1.equals(e2)) //object e2 =new Employee
	{
		System.out.println("Objects are equal");
	}
	else {
		System.out.println("Objects are not equal");
	}
	System.out.println("e1= " +e1.hashCode());
	System.out.println("e2= " +e2.hashCode());
	}
	}
