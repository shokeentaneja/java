package module1programs;
//static scanner class object created globally
import java.util.Scanner;

public class PracticeP3 {
	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
	static int c;
	
	static void input()
	{
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
	}
	static void add()
	{
		c=a+b;
		System.out.println("Addition is:" +c);
	}
	
	static void sub()
	{
		c=a-b;
		System.out.println("substraction is: "+c);
		
	}

	public static void main(String[] args) {
		input();
		add();
		sub();
		
		
		
	}

}
