package module1programs;
import java.util.Scanner;
public class ScanneGlobalProgramP2 {
	int a;
	int b;
	int c;
	
	void inputvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();	
		//sc.close();
	}
	
	void add()
	{
		c=a+b;
		System.out.println("Addition "+c);
	}
	
	void sub()
	{
		c=a-b;
		System.out.println("Substraction is: "+c);
	}
	static void mul(ScanneGlobalProgramP2 obj)
	{
		obj.c=obj.a*obj.b;
		System.out.println("Mul:"+obj.c);
	}

	public static void main(String[] args) {
		ScanneGlobalProgramP2 p2=new ScanneGlobalProgramP2();
		p2.inputvalue();
		p2.add();
		p2.sub();
		mul(p2);
		
	}
}
