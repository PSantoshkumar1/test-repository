package com.assignment;

public class Company1 {

	public static void main(String[] args) {
Employee1 e1=new Employee1("NELLAKANTA",0);
Employee1 e2 =new Employee1("RAMESH",1);
System.out.println(e1);
System.out.println(e2);
System.out.println(e1.equals(e2));
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(">>>>>>>>");

AutomationTestEngineer a1=new AutomationTestEngineer("VINOD",2,"QTP",1000.0);
AutomationTestEngineer a2=new AutomationTestEngineer("AKHIL",3,"Sele",1500.0);
//System.out.println(a1);
//System.out.println(a2);
System.out.println(a1.equals(a2));
System.out.println(a1.hashCode());
System.out.println(a2.hashCode());
System.out.println("<<<<<<<<<<<<<<");
   
	}

}
