package session_04;

public class Student {
	private int rollNo;
	private String name;
	private int m1,m2,m3;
	
	//generate default & parameterized constructor
	// generate getters & toString
	
	Student() {}
	Student(int rollNo, String name,int m1, int m2, int m3) {
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	
	public String toString() {
		return "Student= {"+" rollNo= " +rollNo+" name="+name+" m1="+m1+" m2= "+m2+" m3= "+m3+"}";
}
public static void print(Student[] s) {
	for(Student student:s) {
		System.out.println(student);
	}	
}
public static void main(String args[]) {
	Student[] sArr=new Student[3];
	sArr[0]=new Student(1,"Harsh",91,92,93);
	sArr[1]=new Student(2,"Sangram", 93,94,95);
	sArr[2]=new Student(3,"Raj",92,93,94);
	print(sArr);
}
}