package module1programs;

public class NonStaticMethods {

	public static void main(String[] args) {
		
		System.out.println("Main mehtod starts here:");
		NonStaticMethods n= new NonStaticMethods(); //Create an object
		n.add();			//Call method with variable name/object creation
		n.sub();
		mul();
		n.add(10);
	}

	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("avir");			
	}
	
	void add(int a)
	{
		
		System.out.println("avir "+a);			
	}
	void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);			
	}
	static void mul()	//static method
	{

		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

}

