/*
 Example program for parameterized & non parameterized constructor
 */
package com.constructor;

public class School {

	School()
	{
		System.out.println("School() constructor");
	}
   School(int b)
   {
	   System.out.println("School(int) constructor");
   }
 
	public static void main(String[] args) {
    School s1=new School();
    System.out.println("+++++++++++++");
    School s2=new School();
	}

}
