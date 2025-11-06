package module1programs;

public class NestedIf {

	public static void main(String[] args) {
		int a=10,b=30,c=90;
		
		if(a<=b)
		{
			if(b==c)
			{
				System.out.println("ist statement is executed");
			}
			
			else
			{
				System.out.println("2st statement is  executed-internal else is executing");
			}
			
		}
		else
		{
			System.out.println("3rd statement is  executed-external else is executing");
		}
	}

}
