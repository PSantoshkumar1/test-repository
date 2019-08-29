package com.nonstaticmember;

public class p2 {
void test()
{
	System.out.println("from test");
}
	public static void main(String[] args) {
		System.out.println("fromm main");
		p2 ob1=new p2();
		ob1.test();
		System.out.println("main ends");

	}
}
