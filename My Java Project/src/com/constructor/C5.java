/*
 Program for non parameterized constructor 
 */
package com.constructor;

public class C5 {
	int j ;
	static int  i;
	C5()    // constructor  is a non static context
	{
		i=10;    //accessing static member directly
		System.out.println(C5.i); //10//accessing static member using class name 
		System.out.println(j); //10//accessing non static member directly
		j=20;
		System.out.println(this.j);//20//accessing non-static member using this
		System.out.println(this);//C5@100
	}

	public static void main(String[] args) {
		C5 ob=new C5();

		
	}

}
