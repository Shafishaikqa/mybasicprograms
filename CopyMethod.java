package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyMethod 
{
	public class CopyMethodEx14 
	{

		public void main(String[] args)
		{
			List<String> source = Arrays.asList("Java", "Python", "C++");
			 List<String> destination = new ArrayList<>(Arrays.asList("A", "B",
			"C"));
			 System.out.println("Destination before copy " + destination);
			 // Copy source list into destination list
			 Collections.copy(destination, source);
			 System.out.println("Destination after copy: " + destination);

}
}}