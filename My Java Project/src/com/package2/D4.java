package com.package2;
import com.package1.D1;
public class D4 {

	public static void main(String[] args) {
//System.out.println(D1.i);//i is having t access specifier so   its not visible
D1 d=new D1();//D1 is default constructor which is public
//System.out.println(d.j);//j is having default access specifier hence not visible
	}

}
