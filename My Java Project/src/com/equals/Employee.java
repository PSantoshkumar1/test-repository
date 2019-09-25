package com.equals;

public class Employee {
String name;
int id;
 Employee()
 {
	 
 }
 Employee(String name,int id)
 {
	 this.name=name;
	 this.id=id;
	 
 }
public String toString()
{
	return " Name is "+  name +" ID is "+ id;
	}
public boolean equals(Object ob)
{
	Employee temp=(Employee)ob;
	return this.name.equals(temp.name) &&this.id==temp.id;
}
}
