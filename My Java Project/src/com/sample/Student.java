package com.sample;

public class Student extends School{
	
int fee;

void learn()
{
	System.out.println("student will learn");
}
Student()
{
	
}
Student(String name,int fee)
{
	super(name);
	this.fee=11;
}
}
