package module1programs;
import java.util.Scanner;
public class ScannerProgram5 {
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);	
	//WAP to calculate the the total amount to be paid by the customer:If he has taken 
		//1Million(10 Lacks) Loan for 5 Year with 16% intrest per year using scanner class
		System.out.println("Enter Principal:");
		int p=s1.nextInt();
		System.out.println("Enter Rate:");
		int r=s1.nextInt();
		System.out.println("Enter Time:");
		int t=s1.nextInt();
		System.out.println("Simple Interest is:");
		int si=p*r*t/100;
		System.out.println(si);
		System.out.println("Total amount to be paid is:");
		int Total =si+p;
		System.out.println(Total);
		
		//Take monthly salary of the person and calculate his yearly salary using scanner class
		/*System.out.println("Enter Monthly salary of the person:");
		double d=s1.nextDouble();
		System.out.println("Annual salary of the person is:");
		double salary=12*d;
		System.out.println(salary);
		s1.close();*/
		
	}

}
