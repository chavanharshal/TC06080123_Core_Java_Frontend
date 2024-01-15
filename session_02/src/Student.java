//DAY 2
public class Student {
	private int rollNo;
	private String name;
	private static int count;
	
	public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
		count++;
	}
	public static int getCount()
	{
		return count++;
	}
	public String toString() {
		return "Student [rollNo=" +rollNo+",name=" +name+"]";
	}
	static 
	{
		count=50;
	}
	public static void main(String args[])
	{
		System.out.print("Main Method");
		Student s1=new Student(1,Rahul);
		student s2=new Student(2,Raj);
		Student s3=new Student(3,"Ramesh");
		System.out.println(Student.getCount);
	}
}
