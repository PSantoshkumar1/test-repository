package com.exception;

public class Ce5 {

	public static void main(String[] args) {

		System.out.println(1);
		try
		{
			Class.forName("java.util.Scanner");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}
	}


