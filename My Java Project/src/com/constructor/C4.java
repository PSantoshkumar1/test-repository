/*
 Program for constructor overloading using non parameterized & parameterized constructors
 */
package com.constructor;

public class C4 {
	C4()
	{
		System.out.println("C4() constructor");
	}
	C4(int i)
	{
		System.out.println("C4(int) constructor");
	}

	public static void main(String[] args) {
		C4 ob =new C4();
		System.out.println("++++++++++++++++++");
		C4 ob2=new C4(10);
		
	}

}
