package com.inheritence;

public class Bike extends TwoWheeler{

	double milaiage;
	
	Bike()
	{
		
	}
	Bike(String colour,String name,double milaiage)
	{
		super(colour,name);
		this.milaiage=milaiage;
	
}
}
