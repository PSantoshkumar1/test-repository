package com.constructor;

public class C7 {
	boolean x;
	double y;
	C7(boolean x,double y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		C7 ob1=new C7(false,1.2);
		C7 ob2=new C7(false,3.7);
		C7 ob3=new C7(true,4.2);
		System.out.println("x:"+ob1.x+"       y:"+ob1.y);
		System.out.println("x:"+ob2.x+"       y:"+ob2.y);
		System.out.println("x:"+ob3.x+"       y:"+ob3.y);


	}

}
