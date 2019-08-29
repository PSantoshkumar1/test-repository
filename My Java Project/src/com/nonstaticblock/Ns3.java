package com.nonstaticblock;

public class Ns3 {
	static int i=10;
	int j=20;
	{
		System.out.println(i);
		System.out.println(Ns3.i);
		System.out.println(j);
		System.out.println(this);
		this.j=30;
		System.out.println(this.j);
	}
	public static void main(String[] args) {
		Ns3 ob=new Ns3();

	}

}
