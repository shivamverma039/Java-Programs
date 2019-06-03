package demo;

public class Demo 
{
	    String brand = "casio";
		int add(int a, int b)    //method declaration
		{
			int c = a+b;
			return c;   //return type
		}

	}
	class FinalDemo
	{
		public static void main(String[] args) 
		{
			Demo c = new Demo();  //object declaration
			System.out.println("Brand= " +c.brand);
			int sum=c.add(4,4);    //method declaration,calling line
			System.out.println("Result= " +sum);
		}
}
