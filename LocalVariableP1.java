package module1programs;

public class LocalVariableP1 {

	public static void main(String[] args) {
		int a=10; //local variable
		int b=90; //local variable
		int c=99; //local variable
		int d;		//Declaration
		d=100;		//initialization
		d=10;		//update the value local variable
		System.out.println("d="+d); 	//utilization
		
	}
	
	void add(int a,int b)	//here a,b are local variable
	{
		System.out.println("Addition of 2  numbers:");
	}

}
