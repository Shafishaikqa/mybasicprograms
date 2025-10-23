package arraylist;

import java.util.ArrayList;

public class Contains_Arraylist {

	public static void main(String[] args) 
	{     
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Sita");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);
		System.out.println(a1.size());
		System.out.println(a1.contains("Sita"));// I am checking here if a1 contains Sita in it, the result will be true
		System.out.println(a1);
		

	}

}
