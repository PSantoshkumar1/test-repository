package com.constructor;

public class C1 {
	C1()
	{
		System.out.println("from constructor of C1");
	}

	public static void main(String[] args) {
System.out.println("from main");
C1 ob =new C1();
System.out.println(new C1());
	}

	
}
