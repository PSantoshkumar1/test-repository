package com.exception;

public class E7 {
int i;
	public static void main(String[] args) {
System.out.println(1);
E7 ob=null;
System.out.println(2);
try {
ob.i=10;
System.out.println(3);
}
catch(Throwable e)
{
	System.out.println("caught>>>>>>>>>>>>>"+e);
}
System.out.println(4);
}
}
