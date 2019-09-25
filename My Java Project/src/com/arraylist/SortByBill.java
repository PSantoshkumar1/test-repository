package com.arraylist;

import java.util.Comparator;

public class SortByBill implements Comparator<Patients>{
	
	
	public int compare(Patients p1,Patients p2)
	{
		if(p1.bill>p2.bill)
			return 1;
		else if(p1.bill<p2.bill)
		return -1;
		else 
			return 0;

	}
}
