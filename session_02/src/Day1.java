
public class Day1 {
	public int d,m,y; //instance variable
	
	public void initDate()
	{
		d=m=y=1;
	}
	public void setDate(int dd,int mm,int yy) 
	{
		d=dd;
		m=mm;
		y=yy;
	}
	public void displayDate()
	{
		System.out.println("Date =["+d+"/"+m+"/"+y+"]");
	}
	public static void main(String args[]) {
		Day1 d=new Day1();
		d.displayDate();
		d.initDate();
		d.displayDate();
		d.setDate(17, 10, 2023);
		d.displayDate();
		
	}
}
