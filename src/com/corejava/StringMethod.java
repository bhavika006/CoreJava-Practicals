package com.corejava;
/**
 * Practical No : 10
 * Create programs of all the string methods like charAt(), concat(), equals() etc.
 * @author Bhavika
 */

public class StringMethod {
	
	public static void main(String[] args) {

		// Using the String Method charAt()
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);

		// Using the String Method connect()
		String firstname = "Bhavika";
		String secondname = "Patel";
		System.out.println(firstname.concat(secondname));

		// Using the String Method equal()
		String firstname1 = "bhavika";
		String firstname2 = "bhavika";
		String secondname1 = "Patel";
		System.out.println(firstname1.equals(secondname1));
		System.out.println(firstname1.equals(firstname2));

		// Using the string Method lyrics()
		String x = "I AM VERY STRONG";
		System.out.println( x.toLowerCase() ); // output is "a new java book" 

		// Using the string Method Upercase()
		String A = "i am very strong";
		System.out.println( x.toUpperCase() ); // output is"A NEW JAVA BOOK"

		// Using the string Method contains(“searchString”)
		String x1 = "Java is programming language";
		System.out.println(x1.contains("Amit")); // This will print false
		System.out.println(x1.contains("Java")); // This will print true

		// Using the string Method replace(char old, char new)
		String x11 = "0a0a0a0a0a";
		System.out.println( x11.replace('0', 'A') ); // output is  "AaAaAaAaAa"
			
		// Using the string Method CharArray()
		String B = "BHAVIKA";
		char [] charArray = B.toCharArray();
		System.out.println("Size of char array: " + charArray.length); // Output is Size of char array: 7
			
		// Using the string Method int length()
		String C = "0123456789";
		System.out.println("Checking Length: "+ C.length());

	}

}
