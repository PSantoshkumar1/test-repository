package com.equals;

public class AutomatioonEngineer extends Employee {
	String tool;
	public AutomatioonEngineer() 
	{
	}
	AutomatioonEngineer(String name,int id,String tool)
	{
		super(name,id);
		this.tool=tool;
	}
	public String toString()
	{
		return super. toString()+"  tool is "+  tool;
	}
	public boolean equals(Object ob)
	{
		AutomatioonEngineer temp=(AutomatioonEngineer)ob;
		return super.equals(ob) && this. tool.equals(temp. tool);
	}

}
