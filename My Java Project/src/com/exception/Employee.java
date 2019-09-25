package com.exception;

import java.util.Scanner;

public class Employee {
int salary;
void readsalary() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary");
int salary=sc.nextInt();
if(salary<this.salary)
{
	System.out.println("invalid salary");
	try
	{
	throw new ArithmeticException();	
  }
	catch(ArithmeticException e)
	{
		readsalary();
	}
}
else 
	this.salary=salary;
 }
public Employee(int salary)
{
	this.salary=salary;
}
public static void main(String[] args) {
	Employee e=new Employee(1000);
	System.out.println("employee salary is  "+e.salary);
	e.readsalary();
	System.out.println("raised salary  is "+e.salary);
}
}