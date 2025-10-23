package conditional_statements;

public class Nested_Ifelse {

	public static void main(String[] args) 
	{
		int no1=10;
		int no2=20;
		
		if (no1<no2)
		{
			if(no1<100)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(2);
			}
			
		}
		else
		{
			System.out.println(3);

		}
	}

}
