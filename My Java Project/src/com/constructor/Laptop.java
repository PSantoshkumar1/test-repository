/*
 Write a program to design 
 brand ran processor using constructor
 
 */
package com.constructor;

public class Laptop {
	String brand;
	int ram;
	String processor;
	Laptop(){
		
	}
	Laptop(String brand,int ram,String processor)
	{
		this.brand=brand;
		this.ram=ram;
		this.processor=processor;
	}

}
