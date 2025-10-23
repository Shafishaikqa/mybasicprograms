package arraylist;

import java.util.ArrayList;

public class Remove_Arraylist {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("java");
		a1.add("python");
		a1.add("c++");
		a1.add("c#");
		System.out.println("Before Removal-> "+a1);
		a1.remove("java");
		System.out.println("After Removal-> "+a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("ruby");
		System.out.println("Before Removal-> "+a2);
		a2.removeAll(a1);//we are removing the entire a1 collection from a2 collection
        System.out.println("After Removal-> "+a2);


	}

}
