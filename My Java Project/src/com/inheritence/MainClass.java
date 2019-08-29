package com.inheritence;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(B1.i);
				System.out.println(B1.j);
		//System.out.println(A.j);
		A1.i=100;
		System.out.println(B1.i);
		B1.j=200;
		//System.out.println(A.j);
		System.out.println(B1.j);
	}

}
