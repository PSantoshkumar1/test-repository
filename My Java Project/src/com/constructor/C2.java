/*
 Example program for Default constructor 
 */
package com.constructor;

public class C2 {
	C2(int a)
	{
		System.out.println("from C2");
		
	}
	public static void main(String[] args) {
C2 ob=new C2(10);   // compile time error
	}

}
