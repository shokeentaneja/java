package module1programs;

public class AssertP1 
{

	public static void main(String[] args) {
		int age=20;
		assert age>=18:"Sorry but the condition failed";
		//assert keyword will be by default disable , you will have to enable it
		System.out.println("You are eligible for voting");

	}

}