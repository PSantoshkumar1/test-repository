package com.objectclass1;

public class Oc2 extends Oc1{
int j=20;
public String toString()
{
	return super.toString()+" j:"+j;
}
	public static void main(String[] args) {
Oc2 ob=new Oc2();
System.out.println(ob);
	}

}
