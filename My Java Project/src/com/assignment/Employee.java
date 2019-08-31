package com.assignment;

public class Employee {
	String id;
	String name;
	double salary;
	static int count;
	
	void work()
	{
		System.out.println("Employee is working");
	}
Employee()
{
	count++;
	id="TY"+count;
}

Employee(String name,double salary)
{
	this();
	this.name=name;
	this.salary=salary;
	
}
}