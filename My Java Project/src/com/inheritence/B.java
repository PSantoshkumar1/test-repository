package com.inheritence;

public class B extends A{

	public static void main(String[] args) {
i=10;
System.out.println(B.i);
B.i=20;
System.out.println(A.i);
	}

}
