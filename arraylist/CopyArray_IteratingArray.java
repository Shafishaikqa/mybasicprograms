package arraylist;

import java.util.Arrays;

public class CopyArray_IteratingArray {

	public static void main(String[] args)
	{
		// copy an array by iterating the array.
		
		 int no[]= {543,76,98};
		 int newarray[]=new int[3];
		 for(int i=0;i<=no.length-1;i++)
		 {
			 newarray[i]=no[i];
		 }
		 System.out.println("The new Array is:");
		 System.out.println(Arrays.toString(newarray) );
		 System.out.println("The old Array is:");
		 System.out.println(Arrays.toString(no) );
		
		

	}

}
