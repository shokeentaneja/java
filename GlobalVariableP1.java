package module1programs;
//we are using any static global variable inside any static method with in the same class by its name.
public class GlobalVariableP1 {
	int a=100;	//Global variable or instance variable/non static variable- outside the method but inside the class
	static int b=90; //Global variable static variable-- outside the method but inside the class
	static void son1()
	{
		System.out.println(b);
	}
	
	static void son2()
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		int age=20;	//local variable
		int c=34;	//local variable
		System.out.println(b);
		son1();
		son2();
		
	}

}
