package arraylist;

import java.util.Arrays;

public class Merge_Arrays {

	public static void main(String[] args) 
	{
		int a[]= {6,7,8};
		int b[]= {1,2,3};
		int merge[]=new int[a.length+b.length];//new array
		for(int i=0;i<=a.length-1;i++)// loop to store array a elements into merge array
		{
			merge[i]=a[i];// all elements of a[i] assigned to merge
		//	System.out.println(Arrays.toString(merge));
		}
		for(int j=0;j<=b.length-1;j++)// loop to concatenate array b elements to merge array
		{
			merge[b.length+j]=b[j];// all elements of b[i] assigned to merge
		//	System.out.println(Arrays.toString(merge));
		}
		 System.out.println(Arrays.toString(merge));
	

	}

}
