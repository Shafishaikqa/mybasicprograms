package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Ascen_Desce_Array {

	public static void main(String[] args)
	{
		ArrayList a1=new 	ArrayList();
		a1.add("java");
		a1.add("python");
		a1.add("ruby");
		a1.add("basic");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After Sorting in Ascending order Result will be-> "+ a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("After Sorting in descending order result will be-> "+a1);


	}

}
