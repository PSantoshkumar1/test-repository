package com.sample;

public class Mainc {

	public static void main(String[] args) {
Employee e =new Employee("Kishor",2000,1);
System.out.println("Salary of : "+e.name  +"  is "+e.getSalary()+" Id is :"+e.id);
e.setSalary(3000);
System.out.println("Salary of : "+e.name  +"  is "+e.getSalary()+" Id is :"+e.id);


	}

}
