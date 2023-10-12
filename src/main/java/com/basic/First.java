/**
 * 
 */
package com.basic;

/**
 * @author NITIN
 * 
 *         public: This keyword specifies that the main method is accessible
 *         from outside the class. static: This keyword indicates that the main
 *         method belongs to the class itself rather than an instance of the
 *         class. This is necessary because the JVM needs to call the main
 *         method without creating an object of the class. void: This specifies
 *         that the main method doesn't return any value. main: This is the name
 *         of the method, and it is fixed; you cannot change it. String[] args:
 *         This is the parameter of the main method. It is an array of strings
 *         that allows you to pass command-line arguments to your Java program.
 *         These arguments are typically used to provide input or configuration
 *         settings to your program when it starts.
 *
 */
public class First {

	static String email = "Nitin@gmail.com";

	public static void main(String[] args) {
		String name = "nitin";
		System.out.println("This is the first program" + "\n " + email + " " + name);

	}

}
