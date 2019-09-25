package com.objectclass1;

public class Bike extends Vehicle{
	double miliage;
	String name;

	public Bike() {
		super();
	}

	public Bike(int vno, String colour,double miliage,String name) {
		super(vno, colour);
		this.miliage=miliage;
		this.name=name;
	}

	@Override
	public String toString() {
		return super.toString()+" Miliage is  "+ miliage+" Name is "+name;
	}
	
	}
	


