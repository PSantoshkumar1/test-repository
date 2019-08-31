package com.assignment;

public class Te extends Employee{
String tool;
void WriteScript()
{
	System.out.println("writting script");
	}
Te()
{
	
}
Te(String name,double salary,String tool)
{
	super(name,salary);
	this.tool=tool;
}

}
