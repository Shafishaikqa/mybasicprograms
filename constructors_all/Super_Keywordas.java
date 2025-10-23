package constructors_all;

class Method_parent1
{
	 void login()
	 {
		 System.out.println("login with mobile");

	 }
public class Super_Keywordas extends Method_parent1 
{     
	void login()
	{  
		super.login();
		System.out.println("login with email id");

	}

	public void main(String[] args) 
	{
		 Super_Keywordas s1= new  Super_Keywordas();
		 s1.login();

	}

}}
