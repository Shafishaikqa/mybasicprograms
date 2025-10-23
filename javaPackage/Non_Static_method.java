package javaPackage;

public class Non_Static_method 
{
    void add()
    {
    	System.out.println("addition");

    }
    void sub()
    {
    	System.out.println("subtraction");

    }
	public static void main(String[] args) 
	{
		 Non_Static_method a1= new  Non_Static_method ();
		 a1.add();
		 a1.sub();
	}

}
