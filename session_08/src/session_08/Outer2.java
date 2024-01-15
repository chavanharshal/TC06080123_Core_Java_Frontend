package session_08; //static inner class

public class Outer2 {
	private int i = 100;
	private static int a=1;
	static class Inner {
		int no = 111;
		
		public void get() {
			System.out.println("No = "+no);
			System.out.println("a = "+a);
		}
	}
	public static void main(String[] args) {
		Outer2.Inner o = new Outer2.Inner();    //call a static method
		o.get();
		
		// Inner i-new Outer().new Inner(); i.getNo();	..... another way to call static method }
}
}