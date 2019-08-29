package com.nonstaticblock;

public class Ns1 {
	{
		System.out.println("santu");
	}
	

	public static void main(String[] args) {
		System.out.println("from main");
		Ns1 ob=new Ns1();
		System.out.println(new Ns1());

	}

}
