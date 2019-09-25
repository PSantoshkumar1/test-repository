package com.assignment;

import com.hashCode.D1;

public class Employee1 {
	String name;
	int id;
	Employee1()
	{
		
	} 
Employee1(String name,int id)
{
	this.name =name;
	this.id=id;
}
public String toString()
{
	return "Name is :"+ name  + " Id is  : "+  id;
}
public boolean equals(Object ob)
{
	Employee1 temp=(Employee1)ob;
	return this.name.contentEquals(temp.name) && this.id==(temp.id);
	 
}
public int hashCode()
{
	
	return name.hashCode() +id;
}

	}
	

	


