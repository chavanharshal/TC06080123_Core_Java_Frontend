
public class Addition {
 public int add(int...a)
 {
	 int count=a.length;
	 int s=0;
	 for(int i:a) {
		 s+=a[i];
	 }
	 return s;
 }
 public static void main(String args[]) {
	 Addition a =new Addition();
	 System.out.println(a.add); }
}
