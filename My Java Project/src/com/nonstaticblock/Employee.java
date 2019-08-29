package com.nonstaticblock;

public class Employee {
	 String id;
	String name;  
static int  countEmployee;

{
	countEmployee++;
	id="TY"+countEmployee;
}
	Employee()
	{
		System.out.println("from Employee");
	}
	Employee(String name)
	{
		this.name=name;
	}

public static void main(String[] args) {
	Employee e1=new Employee("Santu");
	System.out.println(e1.name +" "+ e1.id);
	Employee e2=new Employee("SARA");
	System.out.println(e2.name+" "+e2.id);
	Employee e3=new Employee("BHAVYA");
	System.out.println(e3.name+" "+e3.id);
	Employee e4=new Employee("NTR");
	System.out.println(e4.name+" "+e4.id);
	System.out.println(countEmployee);

}
	}

