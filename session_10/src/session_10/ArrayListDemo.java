package session_10;
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		/* int no=10;
		 * Integer i =new Integer(no); ... boxing=primitive to wrapper
		 * int a = i.intValue(); ...unboxing=wrapper to primitive
		 * int b=100;
		 * Integer m=b; ...auto boxing
		 * int c=m; ...auto unboxing
		 */
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		//l.add("ABC");
		l.add(10);
		l.add(10);
		l.add(78);
		l.add(98);
		//l.add(null);
		
		System.out.println(l);
		l.add(2,56);
		System.out.println();
		System.out.println(l.contains(100));
		List l1 = Collections.synchronizedList(l);
		
		Iterator <Integer> i=l.iterator();  // interator cursor
		while(i.hasNext()) {
			int n=i.next();
			if(n%2==0) {
				System.out.println(n);
			}
			else {
				i.remove();
			}
		}
	}
}
