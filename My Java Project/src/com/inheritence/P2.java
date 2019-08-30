package com.inheritence;

public class P2 extends P1{
int j =20;
{
	System.out.println("fromof P2 IIB ");
}
P2()
{
	System.out.println("from P2()");
}

	public static void main(String[] args) {
		System.out.println("from main");
P2 ob1=new P2();
System.out.println(ob1.i);
System.out.println("i:"+ob1.i+"  j:"+ob1.j);
	}

}
