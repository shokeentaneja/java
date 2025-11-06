package module1programs;
//Update value if it is non-static or instance global varible
public class GlobalVariableP4 {
	
	int a=100; //Global variable or instance variable/non static variable- outside the method but inside the class
	static int b=90; //Global variable static variable-- outside the method but inside the class
	
	public static void main(String[] args) {
		GlobalVariableP4 g4= new GlobalVariableP4();
		//g4.a=600;
		//System.out.println("updated value of instance variable a: "+g4.a);
		System.out.println(g4.a=-89);
		
		b=89;
		System.out.println("updated value of static variable b:="+b);
		

	}

}
