package com.constructor;

public class Marker {
	String colour;
	double length;
	Marker(String colour,double length)
	{
		this.colour=colour;
		this.length=length;
	}

	public static void main(String[] args) {
	Marker m1=new Marker("green",3.5);
	System.out.println("colour:"+m1.colour+"     length:"+m1.length);

	}

}
