package com.nonstaticmember;

public class p4 {
	int a;
	void m1()
	{ 
		int a=300;
		System.out.println(this.a);
		this.a=a;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		//p4 ob1=new p4();
		//ob1.a=20;
		//ob1.m1();
		p4 ob2=new p4();
		System.out.println(ob2.a);
		ob2.a=30;
		System.out.println(ob2.a);
		ob2.m1();

	}

}
