package com.exception;

public class E6 {

	public static void main(String[] args) {
		System.out.println(1);
		int a=10,b=1;
				int c;
		System.out.println(2);
		try {
			c=a/b;
			System.out.println(3);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("caught");
		}
System.out.println(4);
		
	}

}
