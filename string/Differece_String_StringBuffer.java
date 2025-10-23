package string;

public class Differece_String_StringBuffer {

	public static void main(String[] args)
	{
		String name="Alex";
		System.out.println(name.concat("Thomas"));//created two strings
		StringBuffer name1=new StringBuffer();
		StringBuffer name2=name1.append("Thomas");
		System.out.println(name2);//add new String

	}

}
