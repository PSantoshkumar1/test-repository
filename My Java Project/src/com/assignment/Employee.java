package com.assignment;

public class Employee {
	String id;
	String name;
	double salary;
	static int count;
	
	void work()
	{
		System.out.println("Employee is dancing");
	}
Employee()
{
	
}

Employee(String name,double salary)
{
	this.name=name;
	this.salary=salary;
	count++;
	id="TY"+count;
}
}
