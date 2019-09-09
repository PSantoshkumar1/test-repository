package com.sample;

public class Bike extends Vehicle {
	
	String name;
	
	
	public Bike() 
	{
		
	}

	public Bike(String vehicleNumber, String colour,String name) 
	{
		super(vehicleNumber, colour);
		this.name=name;
	}
	void move(String name )

	{
		System.out.println("Vehicle name is bike");
	}

	
	
	
	
	
	
	
	
	

}