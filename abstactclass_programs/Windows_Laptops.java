package abstactclass_programs;

abstract class Command_prompt // abstract class
{
	abstract void add(); //abstract method
}
public class Windows_Laptops extends Command_prompt //concrete class
{   
	 void add() 
	   {
		
		System.out.println("The real implementation is be here");

	   }
   public static void main(String[] args) //cocrete method
   {
	   Windows_Laptops w1= new Windows_Laptops();
	   w1.add();
	   
	   // to call noon static method new one 
	   new Windows_Laptops().add();
}
  
}
