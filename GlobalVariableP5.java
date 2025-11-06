package module1programs;
//"3. global variable will have the default value
/*Ex:
byte,short,int and long-0
String-null
boolean-false
char-doesnt have any default value
double and float=0.0"*/


public class GlobalVariableP5 {
	/*static int b=90;
	static double c;
	//c=3.14;	// incorrect 
	static boolean answer;
	static int value;*/
	// Non-static (instance) variables
	int a;
	char c;
	String s;
	boolean value;
	double answer;
	
	

	public static void main(String[] args) {
		//call static global variable in with in the same class
		/*c=3.14;		//correct
		System.out.println(c);
		System.out.println(answer);
		System.out.println(value);*/
		//call instance global variable in with in the same class
		GlobalVariableP5 g5= new GlobalVariableP5();
		System.out.println(g5.a=76);
		System.out.println(g5.s);
		System.out.println(g5.value);
		System.out.println(g5.answer);
		System.out.println(g5.c); //char does not have default value
	}

}
