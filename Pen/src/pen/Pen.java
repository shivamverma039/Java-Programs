package pen;

public class Pen 
{
	
	int y=20;
	void fun()
	{
		int x=10;
		System.out.println(x);
		System.out.println(y);	
	}
	void fun1()
	{
		int z=12;
		System.out.println(z);
		System.out.println(y);
		
	}
	public static void main(String[] args)
	{
		new Pen().fun();
		new Pen().fun1();
	}
}

