package com.sample;

public class Hubli {

	public static void main(String[] args) {
Hospital h;
h=new Doctors();
h.check();
h=new Nurse();
h.check();
System.out.println("<<<<<<<<<<<<<<<");

Doctors d=new Doctors();
d.check();
Nurse n=new Nurse();
n.check();

System.out.println(">>>>>>>>>>>>>>>");
//Doctors.check();
//Nurse.check();
	}

}
