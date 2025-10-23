package Inheritance;
 class Set_Url
 {
	 Set_Url()
	 {
		 System.out.println("Set_Url");

	 }
 }
 class Launch_the_Browser extends  Set_Url
 {
	 Launch_the_Browser()
	 { 
	    super();
	    System.out.println("Launch_the_Browser");
	}
 }
 
public class Testcase1_Super_Calling_implicitly extends Launch_the_Browser
{     
	 Testcase1_Super_Calling_implicitly()
	 {
		 super();
		 System.out.println("Testcase1_Super_Calling_implicitly");

	 }
	public static void main(String[] args) 
	{
		Testcase1_Super_Calling_implicitly s1= new Testcase1_Super_Calling_implicitly();

	}

}
