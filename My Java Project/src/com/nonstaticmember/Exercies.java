//
package com.nonstaticmember;

public class Exercies {

	static int a ;
	int b;
	void test()
	{
		//accessing static inside non-static context
		System.out.println(a); // directly
		Exercies.a=500; //using class name
		System.out.println(this.a);
		//accessing non-static member from non-static context
		System.out.println(b); //directly
		System.out.println(this.a);// using this
	}
	

public static void main(String[] args)
{
	//accessing static member inside static context
	System.out.println(a);//directly 
	System.out.println(Exercies.a); //using class name
	//accessing non-static
	Exercies e1=new Exercies();
	e1.b=10; //by creating an object and using an object references
	System.out.println(e1.b);
	e1.test();
	System.out.println(e1.b);
	System.out.println(a);
}
}





