package com.package2;
import com.package1.R1;
public class R5 extends R1{

	public static void main(String[] args) {
System.out.println(R5.i); //protected static member is inherited in subclass
R5 ob=new R5();
System.out.println(ob.j); //protected non static member is inherited in subclass
	}

}
