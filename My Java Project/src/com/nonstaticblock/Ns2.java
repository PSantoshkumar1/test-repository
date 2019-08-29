package com.nonstaticblock;

public class Ns2 {
	{
		System.out.println("from SBI-10");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		Ns2 ob1 =new Ns2();
		Ns2 ob2 =new Ns2();
		System.out.println("main ends");
	}
	{
		System.out.println("from SBI-20");
	}

}
