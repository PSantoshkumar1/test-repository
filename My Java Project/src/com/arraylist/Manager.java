package com.arraylist;

public class Manager extends Employee1 {
	
	String domain;
	 public Manager() {
	}
Manager(String id,double salary,String domain)
{
	super(id,salary);
	this.domain=domain;
}
public String toString()
{
	return super.toString()+" Domain is  : "+  domain;
}
}
