/*
 Example program for non static method using constructor
 */
package com.constructor;

public class C3 {
	void C3()    // non static method 
	{
		System.out.println("from C3");
	}

	public static void main(String[] args) {
		C3 ob =new C3();

	}

}
