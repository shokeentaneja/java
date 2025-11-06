package module1programs;
//call non static-instance variable
public class Testingstatic {
	int a=100; //Global variable or instance variable/non static variable- outside the method but inside the class
	static int b=90; //Global variable static variable-- outside the method but inside the class
	
	void add()
	{
		Testingstatic g3=new Testingstatic();
		System.out.println(g3.a);
	
	}
	
	public static void main(String[] args) {
		Testingstatic g=new Testingstatic();
		g.add();
		
	}

}
