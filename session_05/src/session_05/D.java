package session_05;

public class D extends C{
	public D() {
		System.out.println("Child Default");
		}
	public D(int a) {
		super(10);
		System.out.println("Chidl Parameterized");
	}
	public static void main(String args[]) {
		D d=new D(10);
	}
}
