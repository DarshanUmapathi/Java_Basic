/**
 * 
 */
package basics;

/**
 * @author darshan.umapathi
 *
 */
public class parsingdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Parsing can be done to convert string to int and various other compatible datatypes
		
		
		String s1 = "20"; // when s1 = "10"(number) it works ; if its "ranjan" it doesnt work xx
		int i1 = 20; 
		String t1 = "false"; // String true = "true"; -  Runtime error.
		//String True = "true"; // Uncomment and try No error.
		System.out.println("String before Parsing :"+ s1);
		System.out.println("String added to a number :"+ i1+ s1);
		System.out.println("String before Parsing :"+ i1*Integer.parseInt(s1));
		Boolean b1 =  Boolean.parseBoolean(t1);
		if(b1) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
		
		// string when used with "+" just adds up 
		
		  int x = Integer.parseInt(s1); 
		  double y = Double.parseDouble(s1); 
		  long z = Long.parseLong(s1);
		
		  System.out.println("Integer"+ x);
		  System.out.println("Double:"+ y);
		  System.out.println("Long :"+z );
	}

}
