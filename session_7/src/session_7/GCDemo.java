package session_7;

public class GCDemo {
	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object Garbage Collected");
	}
	public static void main(String[] args) {
		GCDemo g1=new GCDemo();
		GCDemo g2=new GCDemo();
		GCDemo g3=new GCDemo();
		
		g1=null;
		g2=null;
		g3=null;
		System.gc();
	}
}