package module1programs;

import java.util.Scanner;

public class ScannerProgram3 
{

	public static void main(String[] args) 
	{
		//Scanner s3= new Scanner(System.in);  
		add();
		sub();
		mul();
		ScannerProgram3 obj=new ScannerProgram3(); // we create an abject of ScannerProgram3 class to call non static methods
		
		obj.div();
	}
	static void add()
	{
		Scanner s3= new Scanner(System.in);
		System.out.println("Addition of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s3.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s3.nextInt();
		System.out.println("Output of two numbers is: ");
		int sum=a+b;
		System.out.println(sum);	
	
	}
	
	static void sub()
	{
		Scanner s3= new Scanner(System.in);
		System.out.println("Substraction of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s3.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s3.nextInt();
		System.out.println("Output of two numbers is: ");
		int sub=a-b;
		System.out.println(sub);	
	}

	static void mul()
	{
		Scanner s3= new Scanner(System.in);
		System.out.println("Multiplication of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s3.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s3.nextInt();
		System.out.println("Output of two numbers is: ");
		int mul=a+b;
		System.out.println(mul);	
	}
	
	void div()
	{
		Scanner s3= new Scanner(System.in);
		System.out.println("Division of two numbers");
		System.out.println("Enter the value of a: ");
		int a=s3.nextInt();		
		System.out.println("Enter the value of b: ");
		int b=s3.nextInt();
		System.out.println("Output of two numbers is: ");
		int div=a/b;
		System.out.println(div);	
	}
}
