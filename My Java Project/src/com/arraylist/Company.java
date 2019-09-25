package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee1> employe=new ArrayList();
		employe.add(new Employee1("1",12.0));
		Employee1 e=new Employee1("2",8.8);
		employe.add(new Manager("3",1000.00,"finance"));
		Manager m=new Manager("4",3000.0,"admin");
		System.out.println(employe);
		System.out.println(">>>>>>>>>>>>>>>");
		//accessing individual  object  of ArrayList using get() method
		for(int i=0;i<employe.size();i++)
		{
			Employee1 emp = employe.get(i);
			System.out.println("id is:"+emp.id);
			System.out.println("SAlary is"+emp.salary);
			if(emp instanceof Manager) {
		Manager manager=(Manager)emp;
	//System.out.println("id is:"+manager.id+"SALary is"+manager.salary+"Domain is "+manager.domain);
			}
			//accessing the individual objects using for each

			for(Employee1 emp1:employe)
			{
				System.out.println(emp1.id);
				System.out.println(emp1.salary);
				if(emp instanceof Manager) {
					Manager manager=(Manager)emp;
               System.out.println(manager.domain);
				}
				System.out.println("**********");

				//accessing using iterator()
				Iterator <Employee1>t=employe.iterator();
				while(t.hasNext())
				{
					Employee1 ob=t.next();
					System.out.println("Id is:"+ob.id+"Salary is:"+ob.salary);
					if(ob instanceof Manager)
					{
						Manager manager=(Manager)ob;
						System.out.println("Domain is "+manager.domain);
					}
				}
			}
		}
		
	}

}
