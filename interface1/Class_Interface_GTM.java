package interface1;
interface Amazon
{   
	void login_with_emailid();
	void login_with_mibileno();	
}
public class Class_Interface_GTM implements Amazon
{
	public void login_with_emailid() 
	{
		
		System.out.println("Keep the real logic");

	}
	public void login_with_mibileno() 
	{
		System.out.println("keep the real logic 1");
	}

	public static void main(String[] args)
	{
		

	}

	


	

}
