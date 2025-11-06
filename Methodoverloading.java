package module1programs;
//Method overloading
public class Methodoverloading {
	void add(int a, int b)
	{
		System.out.println("Adding 2 integer value- Sum is: "+(a+b));
	}
	
	void add(int a, double b)
	{
		System.out.println("Adding 2 numbers value- Sum is: "+(a+b));
	}
	
	static void add(int a,double b,long c)
	{
		System.out.println("Adding 2 numbers value- Sum is: "+(a+b+c)); 
		
	}
	
	
	public static void main(String[] args) {
		
		Methodoverloading n=new Methodoverloading();
		n.add(10, 20);
		n.add(100, 928.0);
		add(10, 200, 98980l);
	}

}
