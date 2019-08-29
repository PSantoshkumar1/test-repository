package com.nonstaticblock;

public class Vanhusen {
	String colour;
	String productcode;
	double size;
	static int  countProductcode;
	{
		countProductcode++;
		productcode="VAN"+countProductcode; 
	}
	Vanhusen()
	{
		System.out.println("from brand");
	}
	Vanhusen(String colour,double size)
	{
		this.colour=colour;
		this.size=size;
	}

	public static void main(String[] args) {
Vanhusen v1=new Vanhusen("pink",42.0);
System.out.println("colour:"+v1.colour+"   size:"+v1.size+"   productcode:"+v1.productcode);
Vanhusen v2=new Vanhusen("BLUE",35.0);
System.out.println("colour:"+v2.colour+"    size:"+v2.size+"   productcode:"+v2.productcode);
Vanhusen v3=new Vanhusen("RED",36.0);
System.out.println("colour:"+v3.colour+"   size:"+v3.size+"   produtcode:"+v3.productcode);
Vanhusen v4=new Vanhusen("BLACK",36.0);
System.out.println("colour:"+v4.colour+"   size:"+v4.size+"   productcode:"+v4.productcode);
Vanhusen v5=new Vanhusen("WHITE",44.0);
System.out.println("colour:"+v5.colour+"   size:"+ v5.size+"   productcode:"+ v5.productcode);


	}

}
