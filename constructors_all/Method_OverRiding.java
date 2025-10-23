package constructors_all;

 class Method_parent
 {
	 void login()
	 {
		 System.out.println("login with mobile");
	 }
 }
public class Method_OverRiding extends Method_parent
{     
	void login()
	{   
		System.out.println("login with email id");
	}

	public static void main(String[] args) 
	{
		Method_OverRiding r1=new Method_OverRiding();
		r1.login();
	}

}
