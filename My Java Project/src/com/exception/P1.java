package com.exception;

public class P1 {
int i  ;
	public static void main(String[] args) {
		System.out.println(1);
		P1 ob=null;
		System.out.println(2);
		try {
			System.out.println(3);
			int c=10/0;
			ob.i=10;
			System.out.println(4);
		}
		catch(ArithmeticException a)
		{
	System.out.println("caught");
	System.out.println(a);
	System.out.println(5);
		}
		catch(NullPointerException n)
		{
			System.out.println("caught");
			System.out.println(n);
			System.out.println(6);
		}
		System.out.println(7);
	}

}
