package com.exception;

public class Ce3 {

	public static void main(String[] args) {

		System.out.println(1);
		try
		{
			Class.forName("java.util.scanner");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
