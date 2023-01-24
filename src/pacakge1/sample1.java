package pacakge1;
//this program based on access specifiers
public class sample1
{
   private   int     p=10;
             int     q=20;
   protected int     r=30;
   public    int     s=40; 

//  public static void main(String[] args) 
//   { 
//	   sample1 s1=new sample1();
//	   System.out.println("private access specifier"+s1.p);//To access only with in a class
//	   
//   }
   
}
class sample2 extends sample1
{
	public static void main(String[] args)
	{
		sample2 s2=new sample2();
		//s2 is object reference
		
		System.out.println("default/package access :"+ s2.q);// To access with in a class with in a package
		
		System.out.println("protected access :"+ s2.r);//To access with in a class with in package outside the package 
		                                            // through inheritance
		System.out.println("public access :"+ s2.s);// To access anywhere in the program and highly visibility
		
	}
}
 
