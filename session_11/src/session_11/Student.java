package session_11;
import java.io.Serializable;
public class Student implements Serializable, Cloneable {
	
	private int rollNo;
	private String Name;
	private transient float fees;
	
	public Student () {}
	public Student(int rollNo, String name, float fees) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.fees = fees;
	}
	
	public String toString() {
		return "["+rollNo+","+Name+","+fees+"]";
	}
	public static void main(String args[]) throws CloneNotSupportedException {
		Student s = new Student(2,"Raj",1200.89f);
		Student s2 =(Student)s.clone();
		System.out.println(s2);
	}
}
