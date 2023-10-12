package com.basic;

public class PrimitiveDataTypesExamples {
	/*
	 * Data types in Java are of different sizes and values that can be stored in
	 * the variable that is made as per convenience and circumstances to cover up
	 * all test cases. Java has two categories in which data types are segregated
	 * 
	 * Primitive Data Type: such as boolean, char, int, short, byte, long, float,
	 * and double Non-Primitive Data Type or Object Data type: such as String,
	 * Array, etc.
	 * 
	 * byte: Size: 8 bits Range: -128 to 127 short: Size: 16 bits Range: -32,768 to
	 * 32,767 int: Size: 32 bits Range: -2^31 (-2,147,483,648) to 2^31-1
	 * (2,147,483,647) long: Size: 64 bits Range: -2^63 (-9,223,372,036,854,775,808)
	 * to 2^63-1 (9,223,372,036,854,775,807) float: Size: 32 bits Range:
	 * Approximately ±3.40282347E+38F (6-7 significant decimal digits) double: Size:
	 * 64 bits Range: Approximately ±1.79769313486231570E+308 (15 significant
	 * decimal digits) char: Size: 16 bits Range: Unicode characters (0 to 65,535)
	 * boolean: Represents true or false values
	 */
	public static void main(String[] args) {

		byte a = 101;
		short b = 1000;
		int c = 100000;
		long d = 1000000000L; // Note the 'L' to indicate a long literal

		float e = 3.14F; // Note the 'F' to indicate a float literal
		double f = 2.71828;

		char g = 'A';

		boolean h = true;

		System.out.println("byte: " + a);
		System.out.println("short: " + b);
		System.out.println("int: " + c);
		System.out.println("long: " + d);
		System.out.println("float: " + e);
		System.out.println("double: " + f);
		System.out.println("char: " + g);
		System.out.println("boolean: " + h);
	}
}
