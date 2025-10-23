package conditional_statements;

public class If_ElseIf_Elseif_Else {

	public static void main(String[] args) 
	{
		int no1=10;
		int no2=20;
		int no3=30;
		if(no1>no2) //false
		{
			System.out.println(1);

		}
		else if(no1>no3) //false
		{
			System.out.println(2);

		}
		else if(no3>no2) 
		{
			System.out.println(3);

		}
		else if(no1>no2)
		{
			System.out.println(4);

		}
		else
		{
			System.out.println(5);

		}
	}

}
