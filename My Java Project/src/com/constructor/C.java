package com.constructor;

public class C {
	
	{
		System.out.println("from IIb");
	}
C()
{
	System.out.println("from c()");
}
C(int i)
{
	this();
	System.out.println("from C(int)");
}
	public static void main(String[] args) {
		C oc1=new C();
		C ob2=new C(10);
		

	}

}
