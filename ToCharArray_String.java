package string;

import java.util.Arrays;

public class ToCharArray_String
{

	/*public static void main(String[] args)
	{
		String name= "selenium";
     char a1[]=   name.toCharArray();
     for(int i=0; i<name.length();i++)
     {
    	 System.out.println(a1[i]);
     }

	}

}*/
public static void main(String[] args)
{
	String name= "selenium";
 char a1[]=   name.toCharArray();
 for(int i=0; i<name.length();i++)
 {
	// System.out.println(a1[i]); 
 
      System.out.println(Arrays.toString(a1)); 
 }}}
 