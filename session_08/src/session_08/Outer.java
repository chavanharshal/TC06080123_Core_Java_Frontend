package session_08;

public class Outer {
	private int no = 100;
	
	protected class Inner {
		int no=1000;
		public void getNo() {
			int no = 10;
			System.out.println("No = "+no);
		}
	}
	public void get() {
		Inner i = new Inner();
		i.getNo();
	}
	public static void main(String args[]) {
		 Outer o =new Outer();
		 Inner i=o.new Inner();
		 i.getNo();
		 o.get();
	}
}