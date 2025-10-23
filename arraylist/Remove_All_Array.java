package arraylist;

import java.util.ArrayList;

public class Remove_All_Array {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		System.out.println(al);  // Output: [aa, bb]
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("cc");
		al.removeAll(al2);
		System.out.println(al); // Output: [bb]

		
		
		
	}

}
