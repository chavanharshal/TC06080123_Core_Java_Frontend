//in previous pgm, dates were not swapped, so to overcome that problem we use array in the code
package session_04;

public class Date_2 {
private int d,m,y;
	public Date_2() {}
	public Date_2(int d,int m,int y) {
		this.d=d;
		this.m=m;
		this.y=y;
	}
	public String toString() {
		return "Date [d="+d+",m=" +m+", y="+y+"]";
	}
	public static void swapDates2(Date_2[] d)
	{
		Date_2 temp;
		temp=d[0];
		d[0]=d[1];
		d[1]=temp; 
	}
	public static void main(String []args) {
		Date_2[] d=new Date_2[2];
		d[0]=new Date_2(20,10,2023);
		d[1]=new Date_2(22,11,2023);
		System.out.println("Before Swapping....");
		System.out.println("d1= "+d[0]);
		System.out.println("d2= "+d[1]);
		Date_2.swapDates2(d);
		System.out.println("After Swapping....");
		System.out.println("d1= "+d[0]);
		System.out.println("d2= "+d[1]);
 }
}
