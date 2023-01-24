package pacakge2;
import pacakge1.sample1;

public class sample2 extends sample1
{
	public static void main(String[] args)
	{
	    sample2 s1=new sample2();
	    System.out.println("protected ass spcfir : "+ s1.r);//To access with in a class with in package outside the package
	    												// through inheritance
	    System.out.println("public ass spcfir : "+ s1.s); //To access anywhere in the program and highly visibility
	    //System.out.println("default="+s1.q);
	}
	
}
