package polymorphisP1;

import inheritance23A.MethodOverridingP3;


class one
{
	void contact()
	{
		System.out.println("Contact via youtube");
	}
}
class two extends one
{
	void contact()
	{
		
		System.out.println("Contact via Insta");
	}
}
class three extends two
{
	void contact()
	{
		
		System.out.println("Contact via facebook");
	}
}
class four extends three
{
	void contact()
	{
		
		System.out.println("Contact via Mobile");
	}
}

public class RTPP1 extends four{
	void contact()
	{
		
		System.out.println("Contact via Email");
	}

	

		public static void main(String[] args) 
		{
			RTPP1 p=new RTPP1();
			p.contact();
			
			four f=new four();
			f.contact();
			
			three t=new three();
			t.contact();
			
			two t1=new two();
			t1.contact();
			
			one o=new one();
			o.contact();

	}

}
