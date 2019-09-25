package com.arraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;


public class Hospital {
	public static void main(String[] args) {
		
		ArrayList<Patients> patients=new ArrayList();
		patients.add(new Patients("BAsheer",1200.0,20-1-19));
		patients.add(new Patients("prasanna",1800.0,20-3-19));
		patients.add(new Patients("aniketan",2000.0,20-6-19));
		patients.add(new Patients("ajay",2500.0,20-8-19));
		System.out.println("before sorting");
		System.out.println(patients);
		
		  Iterator <Patients>t=patients.iterator();
		  while(t.hasNext()) 
		  {
			  Patients pai =t.next();
		 System.out.println("Name is:"+pai.name+"  Bill is "+pai.bill+"  DOJ is "+pai.doj);
		  }
		  
		 
//after sorting
Collections.sort(patients);
System.out.println(patients);

for(int i=0;i<patients.size();i++)
{
	System.out.println("NAme is "+patients.get(i)+"BIll is "+patients.get(i)+"DOJ is "+patients.get(i));
	Patients k = patients.get(i);
}
		
		  SortByBill s=new SortByBill(); 
		  System.out.println("Sorting by bill");
		  Collections.sort(patients, s); 
		  for(Patients pn:patients) 
		  {
		  System.out.println("NAme is "+pn.name+"BIll is "+pn.bill+"DOJ is "+pn.doj); 
	}
		  SortByNameOfPatients s1 =new SortByNameOfPatients();
		  System.out.println("sorting by name");
		  Collections.sort(patients, s1);
		  for(Patients ps:patients )
		  {
			  System.out.println("NAme is "+ps.name+"BIll is "+ps.bill+"DOJ is "+ps.doj); 

		  }
}

}