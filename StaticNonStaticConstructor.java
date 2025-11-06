package module1programs;
//ombination of static, non static and constructor	

public class StaticNonStaticConstructor {
	
	static void name()	//static method
	{
		System.out.println("static method calling");
	}
	
	void student()	//Non static method
	{
		System.out.println("Non static method calling");
	}
	
		private StaticNonStaticConstructor()	//Constructor
	{
		System.out.println("constructor calling");
		
	}
		void press(int a, String b) {
			System.out.println("hello");
		}
	
	public static void main(String[] args) {
		
		name();
		StaticNonStaticConstructor s1=new StaticNonStaticConstructor();
		s1.student();
		s1.press( 100,"avir");
		
		
	}
	
	

}
