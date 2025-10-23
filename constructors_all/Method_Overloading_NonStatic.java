package constructors_all;

public class Method_Overloading_NonStatic
{

	

 void add(int a)
{
	   int sum=a+6;
	   System.out.println(sum);

}
 void add(int a, int b)
{
	 int sum =a+b+6;  
	 System.out.println(sum);

}
 void add(double a )
{
	   double sum=a+6;
	   System.out.println(sum);

}
 void add(int a, double b , double c)
{
	 double sum=  a+b+c+6;
	 System.out.println(sum);

}
public static void main(String[] args) 
{   Method_Overloading_NonStatic m1=new Method_Overloading_NonStatic();
	m1.add(100);
	m1.add(100,204);
	m1.add(9.123);
	m1.add(4,4.5,2.3);
}


}
	

