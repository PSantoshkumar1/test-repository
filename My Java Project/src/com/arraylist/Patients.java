package com.arraylist;

public class Patients implements Comparable<Patients>{
	String name;
	double bill;
	int doj;
	Patients ()
	{
	
	}
	Patients(String name, double bill, int doj) 
	{
		this.name = name;
		this.bill = bill;
		this.doj = doj;
	}
	
	
	
	public int compareTo(Patients p)
	{
		if(this.doj>p.doj)
			return 1;
		else if(this.doj<p.doj)
		return -1;
		else 
			return 0;
	}

}
