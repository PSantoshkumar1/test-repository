package com.inheritence;

public class D extends C {
	int y;

	public static void main(String[] args) {
D ob1=new D();
System.out.println("x:"+ob1.x);
System.out.println("y:"+ob1.y);
C ob2=new C();
System.out.println("x:"+ob2.x);
//System.out.println("y:"+ob2.y);
ob2.x=200;
System.out.println("x:"+ob2.x);
	}

}
