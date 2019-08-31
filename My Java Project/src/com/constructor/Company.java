/*
 Write a program to print Class Employee details in class company
 */
package com.constructor;

public class Company {

	public static void main(String[] args) {
Employee e1=new Employee(1,"kalyan",100.0);
Employee e2=new Employee(2,"kishor",100.0);
Employee e3=new Employee(1,"kiran",100.0);


System.out.println("Id is:"+e1.id+"Name is:"+e1.name+"Salary:"+e1.salary);
System.out.println("Id is:"+e2.id+"Name is:"+e2.name+"Salary:"+e2.salary);
System.out.println("Id is:"+e3.id+"Name is:"+e3.name+"Salary:"+e2.salary);

	}

}
