package module1programs;
//call non static-instance variable
public class GlobalVariableP3 {
	int a=100; //Global variable or instance variable/non static variable- outside the method but inside the class
	static int b=600; //Global variable static variable-- outside the method but inside the class
	
	void add()
	{
		
		System.out.println("Non Static method call "+a);
		
		
	}
	
	public static void main(String[] args) {
		
		GlobalVariableP3 g3=new GlobalVariableP3();
		System.out.println("Non static value of a : "+g3.a);
		g3.a=90;			//this is how if can update the value of Non-static global variable
		g3.add();
		System.out.println(b);
	}

}
