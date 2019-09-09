package com.sample;

public class Vehicle {
	String vehicleNumber;
	String colour;
	static int vehiclecount;
	
	
	
	Vehicle()
	{
		
		vehiclecount++;
		vehicleNumber="KA"+vehiclecount;
	}
	public Vehicle(String vehicleNumber, String colour) 
	{
		this();
		this.vehicleNumber = vehicleNumber;
		this.colour = colour;
	}
	void move() 
	{
		System.out.println("vehcle is moving");
	}
	void move(String location)
	{
		System.out.println("vehicle is moving towards"+location);
	}
	
	

}
