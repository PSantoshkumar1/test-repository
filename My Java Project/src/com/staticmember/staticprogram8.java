package com.staticmember;

public class staticprogram8 {  
static int a=20;
static void test()
{
	int a=10;
	System.out.println(a);
}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(staticprogram8.a);
		test();
		System.out.println(a);
	}

}
