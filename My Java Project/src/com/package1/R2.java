package com.package1;

public class R2 {

	public static void main(String[] args) {

	System.out.println(R1.i); //0
	R1 ob=new R1();
	System.out.println(ob.j); //0
	}
}//protected static nd non-static members of R1 are visible outside of the class R1
