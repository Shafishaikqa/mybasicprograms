package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Syncronised_List 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		 List<String> syncList = Collections.synchronizedList(list);
		// Adding elements to the synchronized list
		 syncList.add("Java");
		 syncList.add("Python");

		 // Accessing in a synchronized block
		 synchronized (syncList) 
		 {
		 for (String s : syncList) 
		 {
			 System.out.println(s);
		 }

	

}
}}