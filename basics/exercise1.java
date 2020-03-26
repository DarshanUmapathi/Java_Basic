package basics;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte is 8 bit can store numbers upto 137  and short is 16 bit 32000
		// numeric datatypes 
		
		int i = -4; //32 bit 
		long l = 999999; //64 bit
		float f = 0.44f; // 32 bit
		double d =1.221;// 64 bit memory allocation
		boolean bl = true; // 1 bit 
		
		// ******* Double and float are same but double is more precise than float 
		
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		
		
		// Number conversion:
		// int to double or double to int etc
		
		System.out.println((double)i); // type casting 
		System.out.println((float)l);
		System.out.println((int)d); // leaves the decimals and gives only the integer
		System.out.println((int)f);
		
		// character variables , they can store only one variable 
		// string can store more than one char(multiple characters).
		//char ch = 'an'; and char ch = "a"; if i use this i will get a compilation error dont use double quotes for char 
		char ch = 'a'; // 16 bit unicode 
		String s1 = "Darshan"; // string is a class. 
		System.out.println(ch);
        System.out.println(s1);
        
        char [] stringtochar = s1.toCharArray();
        
        for(char output: stringtochar) {
        	System.out.println(output);
        }
        
        // ****** Some maths operations for warmup 
        int num1 = 9;
        int num2 = 4;
        
        System.out.println( num1 + num2);
        System.out.println( num1 - num2);
        System.out.println( num1 * num2);
        System.out.println( (num1 / num2)); // when an integer is divide by another integer then we get output also integer
        // division might give us float values, to overcome this we use a method of CASTING
        
        
        System.out.println( ((double)num1 / (double)num2));
        System.out.println( ((float)num1 / (float)num2));
       
        
        String s2 = "20.0999999"; // parsing is always done on string 
        System.out.println(Float.parseFloat(s2)); //- Used for string 
        System.out.println(Double.parseDouble(s2)); 
        
        System.out.println( num1 % num2); // % use this to find if a number is prime 
        
        
        
        String i1 = "Hello";
        String i2 = "World";
        
        System.out.println(i1+ " " +i2);
        System.out.println(i1.concat(i2));
        
        
        int num3 = 6;
        num3+=9; // using short hand for operations. +,-,*,/,% etc
        System.out.println(num3);
        
        // remember about increment and decrement operations
        
        
        //??******** Getting input from the user*************************//
       // We use the scanner class for this function.
        
        
        
		/*
		 * we are creating a input object with a SCANNER class. It allows us to take
		 * input from the system. a a
		 */
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter 2 numbers to divide");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        float number3 = (float)number1/(float)number2;
        int number4 = number1%number2;
        
        System.out.println("The quotient is " +number3);
        System.out.println("The remainder is" + number4);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
