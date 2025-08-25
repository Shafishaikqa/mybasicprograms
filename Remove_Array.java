package arraylist;

import java.util.ArrayList;

public class Remove_Array {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		System.out.println(al); //output: [aa, bb]
		al.remove("aa");
		System.out.println(al); // Output: [bb]

	}

}
