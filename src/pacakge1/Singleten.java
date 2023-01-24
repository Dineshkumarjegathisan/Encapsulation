package pacakge1;

public class Singleten 
{
//	public static void main(String[] args) 
	
	private static Singleten st=new Singleten();
	private Singleten()
	{
		System.out.println("dinesh");
	}
	public static Singleten getsingle()
	{
		return st;
	}
	

}
