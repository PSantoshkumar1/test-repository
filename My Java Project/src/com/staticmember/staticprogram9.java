//Sample program for Static Method using S09-S10

package com.staticmember;

public class staticprogram9 {
	static
	{
		System.out.println("SIB-2");
	}
	public static void main(String[] args) {
		System.out.println("from main");
	}
	static
	{
		System.out.println("SIB-1");
	}

}
