package module1programs;
//call global Static variables in different different methods of a same class
public class GlobalVariableP6 {
	
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
	
		add();
		sub();
		div();
		GlobalVariableP6 p6=new GlobalVariableP6();
		p6.mod();
	}
	
static void add()
{

	int c=a+b;
	System.out.println(c);
}

static void sub()
{

	int c=a-b;
	System.out.println(c);
}

static void div()
{
	
	int c=b/a;
	System.out.println(c);
}


void mod()
{
	
	int c=b%a;
	System.out.println(c);
}

}