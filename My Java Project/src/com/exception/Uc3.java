package com.exception;

public class Uc3 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			main(null);
		}
		catch(StackOverflowError s)
		{
			System.out.println(s);
		}
		System.out.println(2);

	}

}
