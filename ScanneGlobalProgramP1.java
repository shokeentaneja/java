package module1programs;
// WAP create scanner object globally and using it in both static and non static method
import java.util.Scanner;

public class ScanneGlobalProgramP1 {
	static Scanner s=new Scanner(System.in);
	
	 void add()
	{
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Addition of two numbers is : "+c);
		
	}
	
	static void sub()
	
	{
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		int c=a-b;
		System.out.println("Substraction of two numbers is : "+c);
		
	}

	public static void main(String[] args) {
		 sub();
		 // We are calling non static method by creating an object 
//here Scanner object we create for input and for call of non static methods we need to create program class object
		 ScanneGlobalProgramP1 p1=new ScanneGlobalProgramP1();
		 p1.add();
		 
		 s.close();
		 
	}

}
