package module1programs;
//Constructor overloading
public class Automation {
	Automation()
	{
		System.out.println("constructor1");
	}
	Automation(int a)
	{
		System.out.println("constructor2 "+a);
	}
	Automation(int a,int b)
	{
		System.out.println("constructor3, a:"+a +" b:"  +b);
	}
	
	Automation(String a)
	{
		System.out.println("constructor4");
	}
	Automation(int a, String b){
		System.out.println("constructor5-int+string");
	}
	
	public static void main(String[] args) {
		
		Automation a1=new Automation();
		Automation a2=new Automation(100);
		Automation a3= new Automation(12,23);
		Automation a4= new Automation("Avir");
		new Automation();  //Other syntax of creating an Object
		new Automation(100,"Avir");
		
		
	}

}
