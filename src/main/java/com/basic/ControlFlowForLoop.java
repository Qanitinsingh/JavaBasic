package com.basic;

import java.util.ArrayList;

public class ControlFlowForLoop {

	/*
	 * Control flow statements in Java are used to control the order in which
	 * statements are executed in a program, and they include:
	 * 
	 * if-else: Used for conditional branching. switch: Allows multiple execution
	 * paths based on the value of an expression. for: Used for looping with a
	 * predetermined number of iterations. while: Used for looping with a condition.
	 * do-while: Similar to the while loop but guarantees at least one execution.
	 * break: Exits the current loop or switch statement. continue: Skips the
	 * current iteration and proceeds to the next iteration of a loop. return: Exits
	 * a method and optionally returns a value.
	 */

	public static void main(String[] args) {

		ControlFlowForLoop obj = new ControlFlowForLoop();
		obj.simpleLoop();
	}

	void simpleLoop() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Simple for loop result = " + i);

		}

	}

	void loopWithBreak() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);

			if (i == 3) {
				System.out.println("Breaking the loop at i = " + i);
				break; // This will exit the loop when i equals 3
			}
		}

	}

	void loopWithContinue() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("Skipping iteration at i = " + i);
				continue; // This will skip the rest of the loop body and continue with the next iteration
			}
			System.out.println("i = " + i);
		}
	}

	void reverseForLoopExample() {

		for (int i = 5; i >= 1; i--) {
			System.out.println("Reverse value is = " + i);
		}
	}

	void arrayTraverseUsingForLoop() {

		int[] numbers = { 10, 20, 30, 40, 50 };

		// Using a for loop to traverse the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at array " + i + ": " + numbers[i]);
		}
	}

	void arrayListTraverseForLoop() {

		ArrayList<Integer> numbers = new ArrayList<>();

		// Adding elements to the ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// Using a for loop to traverse the ArrayList
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("Element at list index " + i + ": " + numbers.get(i));
		}
	}

	void nestedForLoop() {

		int rows = 5;
		int columns = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("* ");
			}
			System.out.println(); // Move to the next row
		}

	}

	void forEachLoop() {
		String[] fruits = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

		// Iterate through the array using a foreach loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
