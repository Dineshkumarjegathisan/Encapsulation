package pacakge1;

public class sample3 
{
	private   int a=10;
	protected int b=20;
			  int c=30;
	public    int d=40;
//	public static void main(String[] args) 
//	{
//		sample3 s1 =new sample3();
//		System.out.println("i am private im available only same class :"+s1.a);
//		
//	}
}
class sample4 extends sample3
{
	public static void main(String[] args) 
	{
		sample3 s2 =new sample4();
		System.out.println("i am prptected im available same class and package :"+s2.b);
		
	}

}
