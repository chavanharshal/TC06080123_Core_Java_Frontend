package session_11;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;


public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList l=new LinkedList();
//		l.add("Harsh");                                .......whole code for linked list
//		l.add(44);
//		l.add(null);
//		l.add(44);
//		l.add(1, 111);
//		System.out.println(l);
//		
//		l.set(0, "Harshal");
//		System.out.println(l);
//		
//		l.removeLast();
//		l.remove(l);         // remove first element
//		l.remove();			 // remove first element
//		System.out.println(l);
//		
//		l.addFirst(1234);
//		System.out.println(l);
//		
//		System.out.println(l instanceof Serializable);
//		System.out.println(l instanceof Cloneable);
//		System.out.println(l instanceof RandomAccess);
		
		l.add("Harsh");
		l.add("Raj");
		l.add("Rohan");
		l.add("Sid");
		System.out.println(l);
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext()) {
			String str = itr.next();
				if(str.equals("Harsh")) {
					itr.set("harshal");
				}
			if(str.equals("Rohan")) {
				itr.add("Raghav");
			}
		}
		System.out.println(l);
		
		while(itr.hasPrevious()) {
			String str=itr.previous();
			if(str.equals("harshal")) {
				itr.set("Harshu");
			}
		}
		System.out.println(l);
		
	
	
	
	}
}
	