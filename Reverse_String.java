package arraylist;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String input="Software"; // This is the string input which is taken to be    reversed
		String output=""; // The output of the string after getting reversed will be stored here and since the string is not yet reversed so it is taken as ""

	for(int i=input.length()-1;i>=0;i--) //For Loop is used to print all elements of string and in string reversal printing will start from last element and end in first element of string so the initial condition is taken as position or index of  last element of string and since indexing ends at position less than length of string so the last index is taken as length-1  and final condition is index of first element and it is taken as zero because indexing starts from zero.
	{
		char reverse= input.charAt(i);// It is used for finding out characters at each index position in reverse order
	output=output+reverse; // For finding out the string in the reverse order

	}

	System.out.println(output);// It will print the string in reverse orde

	}

}
