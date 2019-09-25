package com.arraylist;

public class Resume implements Comparable<Resume>{

	String name;
	double percentage;
	int yop;
	Resume ()
	{
	
	}
Resume(String name, double percentage, int yop) 
	{
		this.name = name;
		this.percentage = percentage;
		this.yop = yop;
	}
	public String toString() {
		return "Resume [name=" + name + ", bill=" + percentage + ", yop=" + yop + "]";
	}
	public int compareTo(Resume r)
	{
		if(this.yop>r.yop)
			return 1;
		else if(this.yop<r.yop)
		return -1;
		else 
			return 0;
}
}