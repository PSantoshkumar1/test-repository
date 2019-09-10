  //sample program for ways to access static members within same class
package com.staticmember;

public class staticprogram3 {
static int i=20;
public static void main(String[] args) {
System.out.println(i);
System.out.println(staticprogram3.i);
staticprogram3.i=30;
System.out.println(i);
	}

}
