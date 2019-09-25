/*
 Sample program for toString method
 */
package com.objectclass1;

public class Oc1 {
int i=10;
public String toString()
{
	return ""+i;
}
	public static void main(String[] args) {
Oc1 ob1=new Oc1();
System.out.println(ob1);
Oc1 ob2 =new Oc1();
ob2.i=20;
System.out.println(ob2);
	}

}
