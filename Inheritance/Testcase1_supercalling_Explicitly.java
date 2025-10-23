package Inheritance;
class Set_Urlas
{
	 Set_Urlas(int age)
	 {
		 System.out.println("Set_Url");

	 }
}
class Launch_the_Browseras extends  Set_Urlas
{
	 Launch_the_Browseras(String Google_Chrome)
	 { 
	    super(90);
	    System.out.println("Launch_the_Browser");
	}
}
public class Testcase1_supercalling_Explicitly extends  Launch_the_Browseras
{
	Testcase1_supercalling_Explicitly ()
	 {
		 super("https://www.amazon.in");
		 System.out.println("Testcase1_Super_Calling_implicitly");
	 }
	public static void main(String[] args)
{
		
		 Testcase1_supercalling_Explicitly v1=new  Testcase1_supercalling_Explicitly();
		  
	}

}
