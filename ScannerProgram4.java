package module1programs;

import java.util.Scanner;

public class ScannerProgram4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		System.err.println("Area of circle is: "+area);	
		
		//circle circumfrence= 2.pi.r
		  System.out.println("Enter radius of the circle:");
		  int t=sc.nextInt();
		  double cir=2*(Math.PI)*r;
		  System.out.println("Circumfrence of circle is: "+cir);
		
		//Triangle area and circumfrence=0.5*b*h, l+b+h
		System.out.println("Enter the value of length:");
		float l=sc.nextFloat();
		
		System.out.println("Enter the value of breath:");
		float b=sc.nextFloat();
		
		System.out.println("Enter the value of height:");
		float h=sc.nextFloat();		
		System.out.println("Area of the triangle:");
		double triangle = 0.5*b*h;
		System.out.println(triangle);
		System.out.println("circumfrence of triangle: ");
		double c =l+b+h;
		System.out.println(c);
		
		//rectangle area and circumfrence=l*w, 2(l+w)
		System.out.println("Enter the value of length:");
		int le=sc.nextInt();
		System.out.println("Enter the value of width:");
		int w=sc.nextInt();
		System.out.println("Area of the rectangle:");
		float ar =le*w;
		System.out.println(ar);
		System.out.println("circumfrence of rectangle: ");
		float cc=2*(le+w);
		System.out.println(cc);
		
		//square area and circumfrence=a*a, 4*a
		System.out.println("Area of the square:");
		float arr=l*l;
		System.out.println(arr);
		System.out.println("circumfrence of the square:");
		float cr=4*l;
		System.out.println(cr);
	
		
	}

}
