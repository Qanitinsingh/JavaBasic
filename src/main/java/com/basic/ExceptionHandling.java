package com.basic;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		ExceptionHandling ex = new ExceptionHandling();
		ex.test();
		test1();
		test2();

	}

	public  void test() throws Exception {
		try {
			
		} catch (Exception e) {

			System.out.println("Exception is caught");
		}

	}

	public static void test1() {
		try {
			int a = 6;
			int b = 0;
			int c = a / b;
			System.out.println("This is a test1 method");
		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException is caught in test 1 method");
		}

	}

	public static void test2() {

		int a = 7;
		int b = 0;
		int c = a / b;
		System.out.println("This is a test2 method");
	}
}
