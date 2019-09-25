package com.arraylist;


import java.util.ArrayList;
public class Bike {
	String colour;
	double miliage;
	public String toString()
	{
		  return "  Colour is  "+  colour+ "  Miliage is  :"+  miliage;
	}
	Bike(){}
	Bike(String colour,double miliage)
	{
		this.colour=colour;
		this.miliage=miliage;
	}

}
