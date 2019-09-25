//sample program for equals method 
package com.objectclass1;

public class A {
int i;

	public static void main(String[] args) {
A ob1=new A();
A ob2=new A();
System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob1.equals(ob2));//false
System.out.println(ob1.equals(ob1));//true
System.out.println(ob2.equals(ob1));//false
System.out.println(ob2.equals(ob2));//true



	}

}
