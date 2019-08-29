package com.nonstaticblock;

public class B {
	int i;
	public B initialize (int i)
	{
		this.i=i;
		return this;
		
	}
	public static B createobject()
	{
		return new B();
	}
	B display()
	{
		System.out.println("i is:"+this.i);
		return this;
	}
	
	public static void main(String[] args) {
		B ob=B.createobject();
B.createobject().initialize(100).display();
	}

}
