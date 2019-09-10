//sample program for static block
package com.staticmember;

public class staticprogram12 {
static int a=10;
static
{
	int i=20;
	System.out.println(i);
	System.out.println(staticprogram12.a);
}
	public static void main(String[] args) {
		System.out.println(a);
	}

}
