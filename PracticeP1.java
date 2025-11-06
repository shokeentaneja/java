package module1programs;

import java.util.Scanner;

//WAP that includes scanner class globally also use static and non static variables globally and static ,non-static methods also
public class PracticeP1 {
	 Scanner s1=new Scanner(System.in);
	 static int a;
	 int b;
	 int c;
	 
	 void inputvalues()
	{
		System.out.println("Enter the value of a: ");
		 a= s1.nextInt();
		System.out.println("Enter the value of b: ");
		b=s1.nextInt();
		System.out.println("addition is c: ");
		s1.close();
		
	}
	void add()
	{
		c=a+b;
		System.out.println(c);
		
	}
	
	 static void sub(PracticeP1 obj) 
	 {
		
		 obj.c=a-obj.b;
		 System.out.println("Substraction: "+obj.c);
	 }
	

	public static void main(String[] args) {
		PracticeP1 P1=new PracticeP1();
		P1.inputvalues();
		P1.add();
		sub(P1);

	}
	

}
