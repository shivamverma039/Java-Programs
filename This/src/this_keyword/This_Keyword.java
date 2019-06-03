package this_keyword;

public class This_Keyword
{
	String s="Shivam";
	void hi()
	{
		String s="Vishal";
		System.out.println(s);
		System.out.println(this.s);
	}
	public static void main(String[] args)
	{
		new This_Keyword().hi();
	}
}
