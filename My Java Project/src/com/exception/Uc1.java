package com.exception;

public class Uc1 {

	public static void main(String[] args) {
System.out.println(1);
B ob;
System.out.println(2);
try {
ob=(B)new A();
System.out.println(3);
}
catch(RuntimeException e)
{
	}
System.out.println(4);
}
	}
	
