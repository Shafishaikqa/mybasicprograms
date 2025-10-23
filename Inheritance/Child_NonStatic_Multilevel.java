package Inheritance;

class Grandparent
{
	 static void method_gp()
	 {
		 
	 }
}	 class parent extends  Grandparent
	 {
		 static void method_p()
		 {
			 
		 }
	 }
public class Child_NonStatic_Multilevel extends parent
       {  
	         static void c()
	         {
	        	 
	         }
	
	
       
	public static void main(String[] args)
	{
		Child_NonStatic_Multilevel c1= new Child_NonStatic_Multilevel();
		c1.c();
		c1.method_p();
		c1.method_gp(); 

	}

	 }
