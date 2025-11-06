package module1programs;

public class FinalkeyProgram {
	final static int noofdaysinyear=365;
	final static double pi=3.14;
	final static int a=12;
	
	

	static void add()
	{
		
		//noofdaysinyear=10; 	//final variable getting compile time error
		final int daysofweek=7;
		//daysofweek=12;
		System.out.println(daysofweek);
	}
	public static void main(String[] args) 
	{
		final int noofdaysinyear=3695;
		System.out.println(noofdaysinyear);
		add();
		System.out.println(FinalkeyProgram.noofdaysinyear);
		//pi=90;	//if we define final keyword then update value will not work
		System.out.println(pi);
		System.out.println(a);
	}
}
