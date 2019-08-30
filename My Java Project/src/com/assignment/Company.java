package com.assignment;

public class Company {

	public static void main(String[] args) {
   Te t1=new Te("Mohan",1200.0,"MT");
   System.out.println("Id:"+t1.id+" is writting a script using "+t1.tool);
   
   
   Te t2=new Te("Kalyan",1500.0,"SQL");
   System.out.println("Id:"+t2.id+" is writting a script using "+t2.tool);
   
   Employee e1=new Employee("Kishor",2000.0);
   System.out.println("Id:"+e1.id+" is writting a script & takes a salary "+e1.salary);
   
   Employee e2=new Employee("Lokesk",5000.0);
   System.out.println("Id:"+e2.id+" is writting a script & takes a salary "+e2.salary);

   


   

	}

}
