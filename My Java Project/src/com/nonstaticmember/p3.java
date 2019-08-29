package com.nonstaticmember;

public class p3 {
	int i;
	void test()
	{
		System.out.println("from test");
		System.out.println(" ");
		System.out.println(i);
		System.out.println(" ");
		System.out.println("this:"+this);
		System.out.println(" ");
		i=20;
		System.out.println(this);
		System.out.println(" ");
		System.out.println("ends of test");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		System.out.println("from main");
		p3 ob=new p3();
		ob.i=10;
		System.out.println(" ");
		ob.test();
		System.out.println(" ");
		//System.out.println(this);
		System.out.println("ob:"+ob);
		System.out.println(" "+" ");
		System.out.println("main ends");


	}

}
