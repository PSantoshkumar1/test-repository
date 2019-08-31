package com.assignment;

public class Home extends Loan {
String name;
	
	
	Home()
	{
		
	}
	
	Home(String type,double roi,int tennure,String name)
	{
	
	
		super(type,roi,tennure);
		this.name=name;
	
	}
}
