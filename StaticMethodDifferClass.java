package module1programs;
import java.lang.Math;
//Program is  how to call static methods of different class--->classname.method name
public class StaticMethodDifferClass {

	public static void main(String[] args) {
	double value= Math.random();  //classname.method name
	System.out.println(value);

	
	double v1=Math.sqrt(100);
	System.out.println(v1);
	
	int v2=Math.min(15, 18);
	System.out.println(v2);
	
	double v3=Math.max(87874.5,Math.max(98945.45,3455.45));
	System.out.println(v3);
	
	int v4=Math.addExact(2121, 87845);
	System.out.println(v4);
	
	long b1=Math.multiplyExact(956766l, 98);
	System.out.println(b1);
	
	System.out.println(Math.multiplyExact(567676876867876l, 98));
	System.out.println(Math.abs(-89));
	
	double x =Math.PI;
	System.out.println(x);
	
		

}
}
