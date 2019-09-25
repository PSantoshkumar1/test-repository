package com.exception;

public class E5 {
int i;
	public static void main(String[] args) {
		System.out.println(1);
		E5 ob;
		System.out.println(2);
		ob=null;
		System.out.println(3);
		try
		{
			System.out.println(ob.i);
		}
		catch(NullPointerException e)
		{
			System.out.println(" done");
			System.out.println(e);
		}
		System.out.println(4);
	
	}

}
