package com.objectclass1;

import org.omg.CORBA.Object;

public class A1 {
int i=10;
A1(int i){
	this.i=i;
}
public boolean equals(Object ob)

{
	return this.i==((A1)ob).i;
}
	public static void main(String[] args) {
A1 ob1=new A1(10);
A1 ob2=new A1(20);
A1 ob3=new A1(10);
System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob3);
System.out.println(ob1.equals(ob2));
System.out.println(ob1.equals(ob3));
System.out.println(ob2.equals(ob1));
System.out.println(ob3.equals(ob2));

	}

}
