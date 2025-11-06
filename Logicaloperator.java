package module1programs;
//WAP on logical operators with AND, OR, AND-NOT and Or-not
public class Logicaloperator {

	public static void main(String[] args) {
		
		int a=20, b=30, c=40;
		String city="Gurgaon", state="Haryana";
		if(a<=b && b<=c)
		{	
			System.out.println("Statement 1 is executed");
			
		}
		
		if(a<=b || b>=c)
		{	
			System.out.println("Statement 2 is executed");
			
		}
		
		if(!(city=="Gurgaon" && state=="Haryana"))
		{
			System.out.println("Statement 2 is executed");
		}
		
		if(!(city=="Gurgaon" && state=="Har"))
		{
			System.out.println("Statement 4 is executed");
		}
		
		if(!(city=="Gurgaon" || state=="Haryana"))
		{
			System.out.println("Statement 5 is executed");
		}
		
		if(!(city=="aon" || state=="ana"))
		{
			System.out.println("Statement 6 is executed");
		}
	}

}
