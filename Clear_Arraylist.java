package arraylist;

import java.util.ArrayList;

public class Clear_Arraylist {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		System.out.println(al); // Output: [aa, bb]
		al.clear();
		System.out.println("After Clearing the data "+al); // Output: []

	}

}
