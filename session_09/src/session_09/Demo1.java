package session_09;
public class Demo1 {
	public static void main(String args[]) {
		try {
			int a,b,c=0;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.print("Div "+c);
		//catch(Exception e) { 
		//System.out.println("division by zero");}
		/* } catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleast two parameters");
		}
		catch(NumberFormatException e) {
			System.out.println("Enter only integer data");
		}
		catch(Exception e) {
			System.out.println("Exception Occurred!!!!");
		} */            // diff method for catch blocks
			
		} catch (Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("Denominator should not be zero");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Enter atleast two parameters");
			}
			else if(e instanceof NumberFormatException) {
				System.out.println("Enter only integer data");
			}
			else {
				System.out.println("Exception Occurred!!!!");
			}
		}
}  }