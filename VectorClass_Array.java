package arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass_Array 
{

	public static void main(String[] args)
	{
		 {
			Vector v= new Vector();
			v.add(10);
			v.add("Books");
			v.add(15.2);
			
			Enumeration e= v.elements();
			while(e.hasMoreElements()==true)
			{
				System.out.println(e.nextElement());
			}
	}

}}
