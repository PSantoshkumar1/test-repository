/*
Write  a program for non parameterized constructor & print the values for the non static variables 
 */
package com.constructor;

public class C6 {
	int i;
	C6()
	{
		i=10;
	}

	public static void main(String[] args) {
		C6 p1=new C6();
		C6 p2=new C6();
		C6 p3=new C6();
		System.out.println("i value for my 1st object :"+p1.i);
		System.out.println("i value for my 2nd object :"+p2.i);
		System.out.println("i value for my 3rd object :"+p3.i);



		
	}

}
