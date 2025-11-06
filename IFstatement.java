package module1programs;

public class IFstatement {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		//int a=10, b=20, c=30;    // we can declare local variabl like this also
		
		if(a>b) 
		{
			System.out.println("Case 1 is executed "+"a= "+a +"b=" +b +(a>b));
		}
		if(a<b)
		{
			System.out.println("Case 2 is executed a=" + a + ", b=" + b +" "+(a<b));

		}
		if(a>=b)
		{
			System.out.println("Case 3 is executed "+(a>=b));
		}
		if(a<=b)
		{
			System.out.println("Case 4 is executed " + "a= " +a + ",b=" +b +" " +(a<=b));
		}
		if(a==b) 
		{
			System.out.println("Case 5 is executed "+(a==b));
		}
		if(a!=b)
		{
			System.out.println("Case 6 is executed "+"a= "+a +",b=" +b +" " +(a!=b));
		}
		
		if(b<c)
		{
			System.out.println("Case 7 is executed "+(b<c));
		}
		
		if(c>a)
		{
			System.out.println("Case 8 is executed "+(c>a));
		}
		
	}

}
