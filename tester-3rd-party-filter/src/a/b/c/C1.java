package a.b.c;

public class C1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Exception e = new Exception("C1");
			throw e;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}