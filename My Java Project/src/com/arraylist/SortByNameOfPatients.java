package com.arraylist;

import java.util.Comparator;

public class SortByNameOfPatients implements Comparator<Patients> {
	
	
	public int compare(Patients p1,Patients p2)
	{
		return p1.name.compareTo(p2.name);
	}
	

}
