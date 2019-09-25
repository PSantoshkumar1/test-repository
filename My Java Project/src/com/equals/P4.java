package com.equals;

public class P4 extends P3{

	char ch;
	P4(String s,int j,char ch)
	{
		this.s=s;
		this.j=j;
		this.ch=ch;
	}
	public boolean equals(Object ob)
	{
		P4 temp=(P4)ob;
		return super.equals(temp) && this.ch==temp.ch;
	}
	public static void main(String[] args) {
		P3 ob1=new P3("ABC",10);
		P3 ob2=new P3("ABC",10);
		System.out.println(ob1.equals(ob2));
		P4 ob3=new P4("XYZ",10,'a');
		P4 ob4=new P4("XYZ",10,'b');
		System.out.println(ob3.equals(ob4));
		
		
	}
	
	
}
