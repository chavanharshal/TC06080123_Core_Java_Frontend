package session_06;

public class Calculation extends CompareCal implements StaticCal, Factorial {

	public int add(int a, int b) {
		return (a+b);
	}
	public int sub(int a,int b) {
		return(a-b);
	}
	public int avg(int a,int b) {
		return (a+b)/2;
	}
	public int fact(int n) {
		int f =1;
		for (int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
}