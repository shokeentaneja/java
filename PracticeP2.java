package module1programs;

import java.util.Scanner;

public class PracticeP2 {
	static Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	static String g;
	
	void addition()
	{
		System.out.println("Enter value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value b: ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition output is: "+c);
		
	}
	void Sub()
	{
		c=a-b;
		System.out.println("Substraction output is: "+c);
	}
	
	static void name()
	{

		System.out.println("enter name: ");
		g=sc.next();
		System.out.println("output is: "+g);
	
	}

	public static void main(String[] args) {
		PracticeP2 p2=new PracticeP2();
		p2.addition();
		p2.Sub();
		name();

	}

}
