package Inheritance;

public class This_Calling
{
	This_Calling(int a)
	{
		System.out.println(1);

	}
	This_Calling(int a,int b)
	{    this(2); 
		System.out.println(2);
	}
	This_Calling(int a, double b)
	{    this(10,20);
		System.out.println(3);
	}

	public static void main(String[] args) 
	{
		This_Calling t1= new This_Calling(10,3.14);

	}

}
