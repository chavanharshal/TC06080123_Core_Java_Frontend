package session_14;

public class ThreadGroupDemo {
	public static void main(String args[]) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");
		MyThread t1 = new MyThread(pg, "first");
		MyThread t2 =new MyThread(pg,"second");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());  //2
		System.out.println(pg.activeGroupCount()); //1
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());  //0
		System.out.println(pg.activeGroupCount()); //1
		pg.list();
	}
}