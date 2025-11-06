//Scanner program using input from main scanner object not creating obj of scanner in every method of scanner class
/*Scanner s6 = new Scanner(System.in); is created inside main.
The scope of s6 is only within main (local variable).
If you want to use the same Scanner object in other methods, you need to pass it as a parameter.*/

package module1programs;

import java.util.Scanner;

public class ScannerProgram6
{

	public static void main(String[] args) 
	{
		Scanner s6= new Scanner(System.in);   // we can create here object and use through out the program
		add(s6);	//here main gives its Scanner to add()
		sub(s6);
		mul(s6);
		ScannerProgram6 obj=new ScannerProgram6(); // we create an abject of ScannerProgram3 class to call non static methods
		
		obj.div(s6);
	}
	static void add(Scanner s6)		//here we pass Scanner s6 as a parameter bcz we want to use scanner class thats why we passes its object here
	{
		System.out.println("Addition of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s6.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s6.nextInt();
		System.out.println("Output of two numbers is: ");
		int sum=a+b;
		System.out.println(sum);	
	
	}
	
	static void sub(Scanner s6)
	{
		System.out.println("Substraction of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s6.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s6.nextInt();
		System.out.println("Output of two numbers is: ");
		int sub=a-b;
		System.out.println(sub);	
	}

	static void mul(Scanner s6)
	{
		System.out.println("Multiplication of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s6.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s6.nextInt();
		System.out.println("Output of two numbers is: ");
		int mul=a+b;
		System.out.println(mul);	
	}
	
	void div(Scanner s6)
	{
		System.out.println("Division of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s6.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s6.nextInt();
		System.out.println("Output of two numbers is: ");
		int div=a/b;
		System.out.println(div);	
	}
}
