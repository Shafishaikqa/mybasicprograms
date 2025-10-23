package arraylist;

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AddAll_Arraylist {

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(200);
		System.out.println(al); // output:- [100, 200]
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		System.out.println(al2); // output:- [aa, bb]
		al.addAll(al2);
		System.out.println(al); // output:- [100, 200, aa, bb]

	}

}
