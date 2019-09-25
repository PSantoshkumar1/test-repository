package com.hashCode;

public class MainClass {

	public static void main(String[] args) throws Exception{
D1 d1=new D1(10,'a');
D1 d2 =new D1(10,'a');
System.out.println(d1.equals(d2));
System.out.println(d1.hashCode());
System.out.println(d2.hashCode());
System.out.println(">>>>>>>>>>>>>>");


D2 d3=new D2(10,'a',true,"ABC");
D2 d4=new D2(10,'a',false,"ABC");
System.out.println(d3.equals(d4));
System.out.println(d3.hashCode());
System.out.println(d4.hashCode());
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


D3 d5=new D3(10,'a',true,"ABC",10.0);
D3 d6=new D3(10,'a',true,"ABC",10.0);
System.out.println(d5.equals(d6));
System.out.println(d5.hashCode());
System.out.println(d6.hashCode());
System.out.println("|||||||||||||||");
	}

}
