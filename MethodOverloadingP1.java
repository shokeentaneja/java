package module1programs;

public class MethodOverloadingP1 {
	
	  void add(int a,int b)
      {
              System.out.println("Adding 2 int value");
      }
       void add(int a,double b)
      {
                      System.out.println("Adding 1 int value and 1 double");
      }
      static void add(double a,double b)
      {
              System.out.println("Adding 2 double");
      }
      static void add(float a,int b,int c)
      {
              System.out.println("Adding 1 double value,2 int");
      }
      public static void main(String[] args) 
      {
    	  MethodOverloadingP1 a1 = new MethodOverloadingP1();
              a1.add(10, 20);
              a1.add(20, 100.0);
              add(10.0, 20.0);
              add(10.0f,20, 30); 
      }
}