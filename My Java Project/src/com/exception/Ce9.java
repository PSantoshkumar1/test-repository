package com.exception;

public class Ce9 {
	static void test() throws ClassNotFoundException
	{
		Class.forName("java.util.Scanner");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("from main");
		test();
		System.out.println("main ends");

	}

}
