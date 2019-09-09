package com.package2;

import com.package1.D1;
public class D5 extends D1  {

	public static void main(String[] args) {
//System.out.println(D5.i); //i is not inherited D5 because it has default access 
D5 ob =new D5();
//System.out.println(ob.j); //j is not inherited in object of D5 subclass
	}

}// static or non-static members of super class are not inherited outside 
//the package if they have default access specifier 
