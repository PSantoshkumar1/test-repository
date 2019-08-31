package com.assignment;

public class Loan {
String type;
double roi;
int tennure;
double amount;


 void interest(int principal)
{
	double amount1=principal+(principal*roi*tennure)/100;
	System.out.println(amount1);
}
Loan()
{
	
}
Loan(String type,double roi,int tennure)
{
	this.type=type;
	this.roi=roi;
	this.tennure=tennure;
}

	}

