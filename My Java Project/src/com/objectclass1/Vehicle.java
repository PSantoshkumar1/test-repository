package com.objectclass1;

public class Vehicle {
	int vno;	
	String colour;
	Vehicle()
	{
		
	}
	Vehicle(int vno,String colour)
	{
		this.vno=vno;
		this.colour=colour;
	}
	public String toString()
	{
		return " Vno is "+ vno+ "  Vehicle colour is "+colour;
	}

}
