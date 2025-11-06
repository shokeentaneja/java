package module1programs;
//Update value if it is static global varible

public class GlobalVariableP2 {
	int a=100; //Global variable or instance variable/non static variable- outside the method but inside the class
	static int b=90; //Global variable static variable-- outside the method but inside the class
	

	public static void main(String[] args) {
		System.out.println(b);
		b=900; //this is how if can update the value of static global variable
		System.out.println(b);
	}
}
