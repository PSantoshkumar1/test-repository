package com.nonstaticblock;

public class Ns4 {
	int i =10;   //there is non static initializer
	{
		System.out.println(i);
		this.i=20;
	}
	Ns4()
	{
		System.out.println("from Ns4()");
	}

}
