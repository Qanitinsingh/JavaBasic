package com.basic;

public class JavaIfelse {

	public static void main(String[] args) {
		JavaIfelse obj = new JavaIfelse();
		

	}

	void ifExample() {
		int number = 10;
		if (number > 5) {
			System.out.println("Number is greater than 5.");
		}
	}

	void ifElseExample() {
		int age = 18;
		if (age >= 18) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are not an adult.");
		}
	}

	void ifElseLadderExample() {
		int score = 75;
		if (score >= 90) {
			System.out.println("Excellent!");
		} else if (score >= 70) {
			System.out.println("Good job!");
		} else if (score >= 50) {
			System.out.println("You passed.");
		} else {
			System.out.println("You need to improve.");
		}
	}

	void nestedIfExample() {
		boolean isRaining = true;
		int umbrellaCount = 3;
		if (isRaining) {
			if (umbrellaCount > 0) {
				System.out.println("You can use an umbrella.");
			} else {
				System.out.println("You'll get wet!");
			}
		} else {
			System.out.println("It's not raining.");
		}
	}

	void ifElseForLoop() {
		int[] numbers = { 5, 10, 15, 20, 25 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " is even.");
			} else {
				System.out.println(numbers[i] + " is odd.");
			}
		}
	}

	void ifElseForEachLoop() {
		int[] numbers = { 5, 10, 15, 20, 25 };

		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number + " is even.");
			} else {
				System.out.println(number + " is odd.");
			}
		}
	}

}
