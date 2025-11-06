package module1programs;

public class NestedElseif {

	public static void main(String[] args) {
		int a=20,b=90,c=40;
		if(a<=b) 
		{
			if(b==c)
			{
				System.out.println("1st statement excecute");
			}
			
			else if(b<=c)
			{
				System.out.println("2nd statement excecute");
			}
			
			else if(c>=a)
			{
				System.out.println("3rd statement excecute");
			}
			
		}

		else
		{
			System.out.println("No result found");
		}
	}

}
