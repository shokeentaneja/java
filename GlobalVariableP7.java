package module1programs;
//call global instance variables in different different methods of a same class
public class GlobalVariableP7 {
	int a=50;
	int b=20;
	int c;	  //define int c like this in the class globaly if you want use c in the multiple methods
	
	void add()
	{
		//int c=a+b; //define int c like this in the class localy if you want use c in the only this methods, no need to define c in the class globaly
		c=a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		c=a-b;
		System.out.println(c);

	}
	 void mul()
	{
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		GlobalVariableP7 g7=new GlobalVariableP7();
		g7.add();		//either use this or use below statement 
		//System.out.println(g7.c);
		g7.sub();
		g7.mul();
		
	}

}