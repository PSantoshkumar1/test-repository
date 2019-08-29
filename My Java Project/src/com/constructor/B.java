package com.constructor;

public class B {
	B()
	{
		this(10);
		System.out.println("from B()");
	}
	B(int c)
	{
		this(10.0);
		System.out.println("from B(int)");
	}
	B(double i)
	{
		System.out.println("from double()");
	}

	public static void main(String[] args) {
B ob1=new B();
System.out.println("***************");
B ob2=new B(10);
System.out.println("**********************");
B ob3=new B(10.0);

	}

}
