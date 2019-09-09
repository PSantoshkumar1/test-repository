package com.sample;

public class Re extends Bike{
	
	
	double miliage;
	
	Re()
	{
		
	}
	Re(String vehicleNumber,String colour,String name,double miliage)
	{
		super(vehicleNumber,colour,name);
		this.miliage=miliage;
		
	}
	@Override
	void move() 
	{
		System.out.println(" royal enfeild");
		
	}
		

}
