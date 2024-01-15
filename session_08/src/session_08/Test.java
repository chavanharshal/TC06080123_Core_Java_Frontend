package session_08;      //anonymous inner 

public class Test extends A {
	public static void main(String args[]) {
	Popcorn  p = new Popcorn() {
		public void taste() {
			System.out.println("Cheesy");
		}
	};
	p.taste();
}
}