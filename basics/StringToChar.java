package basics;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		
		String names = "Darshan is good";
		String Names = names.toUpperCase();
		int value = names.length();
		System.out.println(value);
		
		  
			  char[] StringTochar = Names.toCharArray();
		       //System.out.println(StringTochar[value]); }

		  for(char output: StringTochar){
			  System.out.println(output); 
			  
		  }
		 
		/*
		 * int n=0; Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the length of array"); n = s.nextInt();
		 * System.out.println(n);
		 */

	}
	
}
