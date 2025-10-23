package arraylist;

import java.util.ArrayList;

public class ContainsAll_Array {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		System.out.println(al.containsAll(al2)); //Output: true

	}

}
