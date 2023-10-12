package com.basic;

public class NonPrimitiveDataTypeExamples {

	public static void main(String[] args) {
		NonPrimitiveDataTypeExamples obj = new NonPrimitiveDataTypeExamples();
		obj.arrayExample();

	}

	void StringExample() {
		// creating a string and initializing it
int number = 20;
		String str = "Hello! This is example of String type"; // This is a non primitive

		// applying substring() on above string
		String subStr = str.substring(0, 25);

		// printing the string
		System.out.println(subStr + ": "+ number);
	}

	void stringConcat() {

		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
	}

	void arrayExample() {
		
		String[] cars = { "Volvo", "BMW", "Ford", "Honda" };
		
//		System.out.println(cars[3]);
//		System.out.println(cars.length);
		// through loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
//		// Through foreachLoop
//		for (String i : cars) {
//			System.out.println(i);
//		}
	}

	void multiDArrayExample() {
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(myNumbers[1][2]);
	}
}
