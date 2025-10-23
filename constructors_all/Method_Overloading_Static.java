package constructors_all;

public class Method_Overloading_Static {
	   static void add(int a)
	   {
		   int sum=a+6;
		   System.out.println(sum);

	   }
	   static void add(int a, int b)
	   {
		 int sum =a+b+6;  
		 System.out.println(sum);

	   }
	   static void add(double a )
	   {
		   double sum=a+6;
		   System.out.println(sum);

	   }
	   static void add(int a, double b , double c)
	   {
		 double sum=  a+b+c+6;
		 System.out.println(sum);

	   }
	public static void main(String[] args)
	{
	   add(100);
	   add(100,200);
	   add(9.123);
	   add(4,4.5,2.3);
	   
}
}
