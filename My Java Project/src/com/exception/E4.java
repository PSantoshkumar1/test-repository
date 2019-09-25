package com.exception;

public class E4 {

	public static void main(String[] args) {
		System.out.println(1);
		int a=10,b=0;
				int c;
		System.out.println(2);
		try {
			c=a/b;  //exception occurs & its atrithmetic exception
			System.out.println(3);
		}
	
		catch(Throwable e)
		{
			System.out.println("caught");
			System.out.println(e);
		}
System.out.println(4);
		
	}

}
