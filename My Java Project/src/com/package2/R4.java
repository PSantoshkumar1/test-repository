package com.package2;
import com.package1.R1;
public class R4 {

	public static void main(String[] args) {
		//System.out.println(R1.i); //protected member is not visible outside the  package in different class
		R1 ob=new R1();
		//System.out.println(ob.j);  //""""""""""""""""""""""""""""""""""""

	}

}
