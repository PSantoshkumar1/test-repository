package com.nonstaticmember;

public class company {

	public static void main(String[] args) {
		employee e1;
		e1=new employee();
		System.out.println("employee name:"+e1.name+" id:"+e1.id);
		
		employee e2=new employee();
		System.out.println("employee name:"+e2.name+" id:"+e2.id);
		e2.name="chikku";
		e2.id=1;
		System.out.println("employee name:"+e2.name+" id:"+e2.id);
		employee e3=new employee();
		e3.name="chikki";
		e3.id=2;
		System.out.println("employee name:"+e3.name+" id:"+e3.id);

	}

}
