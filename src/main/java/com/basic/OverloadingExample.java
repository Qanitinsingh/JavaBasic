package com.basic;

public class OverloadingExample {

	/*
	 * Method overloading occurs in the same class when you have multiple methods
	 * with the same name but different parameter lists.
	 * 
	 * Method overriding occurs in a subclass when you provide a specific
	 * implementation for a method that is already defined in the superclass.
	 * 
	 */

	public static void main(String[] args) {
		OverloadingExample obj = new OverloadingExample();

		int result = obj.addNumbers(10, 20 , 30 );
		
		System.out.println("This is a output of overloading example is "+result);
		
		
		int returnvalue= obj.addNum();
		System.out.println("This is a output of other method example is "+returnvalue);

		
		String empName =obj.printName();
		System.out.println(empName);
	}

	public int addNumbers(int firstNumber, int secondNumber)

	{
		int addition = firstNumber + secondNumber;

		return addition;
	}

	public int addNumbers(int firstNumber, int secondNumber, int thridNumber )

	{
		int addition = firstNumber + secondNumber;

		return addition;
	}

	public String  printName() {
		String name = "Rajesh";
		return name;
		
	}

	
	public static int addNum()
	{
		int localVar=70;
		
		return localVar;
		
	}
	
	public int testMethod(int a , int b , int c , String abc , byte xyz , long trtyr , double hgfhg )
	{
		int numbers= a+b+c;
		
		return numbers;
	}
	
}
