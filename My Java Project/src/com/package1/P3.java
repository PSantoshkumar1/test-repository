package com.package1;

public class P3 extends P1{

	public static void main(String[] args) {
System.out.println(P3.j);  
//System.out.println(P3.i);  //cte because i is private member of P1 hence not inherited in subclass
	
	P3 p=new P3();
	//System.out.println(p.x); //cte because x i private non-static member of P1 so  its not inherited in subclass object
	
	
	}
	
	
	

}
