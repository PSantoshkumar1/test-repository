package com.equals;

public class P2 {
	String str;
	P2(String str)
	{
		this.str=str;
		
	}
	public static void main(String[] args) {
		P2 p1=new P2("ABC");
		P2 p2=new P2("XYZ");
		P2 p3=new P2("ABC");
		System.out.println(p1.str.contentEquals(p2.str));
				
	}

}
