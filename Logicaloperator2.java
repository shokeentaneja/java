package module1programs;

public class Logicaloperator2 {
	public static void main(String[] args) {
		int a=10, b=20, c=40;
		//AND Operator
		if(a<=b && b<=c)
		{
			System.out.println("Statement 1 is executed "+(a<=b && b<=c));
		}
		if(a>=b && b<=c)
		{
			System.out.println("Statement 2 is executed "+(a>=b && b<=c));
		}
		//OR Operator
		if(a<=b || b>=c)
		{
			System.out.println("Statement 3 is executed "+(a<=b || b>=c));
		}
		
		if(a<=b || b<=c)
		{
			System.out.println("Statement 4 is executed "+(a<=b || b<=c));
		}
		//NOT Operator
		if(!(a<=b || b<=c))
		{
			System.out.println("Statement 5 is executed "+(!(a<=b || b<=c)));
		}
		
		if(!(a<=b && b>=c))
		{
			System.out.println("Statement 6 is executed "+(!(a<=b && b>=c)));
		}
	}

}
