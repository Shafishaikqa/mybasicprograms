package map_interface;

import java.util.HashMap;
import java.util.Map;

public class Get_Interface {

	public static void main(String[] args) 
	{
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
		System.out.println(m1.get("Sugar"));
		//Returns the value mapped with the specified key or null if the key is not mapped

	}

}
