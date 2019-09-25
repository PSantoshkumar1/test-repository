package com.treeset;

public class Employee implements Comparable<Employee>
{
	String name;
	int id;
	
	
	public Employee() 
	{
	}
	Employee(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return "Name is  :"+ name +"   Id is "+ id;
	}
public int compareTo(Employee emp)
{
  return this.name.compareTo(emp.name);
}
}