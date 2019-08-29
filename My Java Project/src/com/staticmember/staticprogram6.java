package com.staticmember;

public class staticprogram6 {
static void test( )
{
	System.out.println("from test()");
}
	public static void main(String[] args) {
System.out.println("main beigns");
test();
System.out.println("++++++");
staticprogram6.test();
System.out.println("main ends");
	}

}
