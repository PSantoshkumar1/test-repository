package com.exception;

public class Ce4 {

	public static void main(String[] args) {

		System.out.println(1);
		try
		{
			Class.forName("java.util.Scanner");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(Throwable e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
