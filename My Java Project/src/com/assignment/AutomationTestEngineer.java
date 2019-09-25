package com.assignment;

public class AutomationTestEngineer extends Employee{
	
	String tool;
	double salary;

	AutomationTestEngineer()
	{
		
	} 
AutomationTestEngineer(String name,int id,String tool,double salary)
{
	super(name,id);
	this.tool=tool;
	this.salary=salary;
}
public String toString()
{
	return super.toString()+" tool is :"+ tool+ "  Salary is : "+salary;
}
public boolean equals(Object ob)
{
	AutomationTestEngineer temp=(AutomationTestEngineer)ob;
	return super.equals(temp) && this.tool.contentEquals(temp.tool)
			                  && this.salary==temp.salary;
}
public int hashCode()
{
 int a=(int)salary;
int hc=a+tool.hashCode()+super.hashCode();
return hc;
}
}
