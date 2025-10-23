package Inheritance;
 class Grandparent
 {
	 static void method_gp()
	 {
		 
	 }
 }
  class Parent extends Grandparent
 {
	  static void method_p()
		 {
			 
		 }
 }
public class Child_multilevel extends Parent
{
	 static void method_ch()
	 {
		 
	 }
	public static void main(String[] args)
	{
		method_gp();
		method_p();
		method_ch();

	}

}
