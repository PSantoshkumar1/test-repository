package com.assignment;

public class Loan {
String type;
double roi;
int tennure;
double amount;


double interest(int a)
{
	double amount1=a+(double)(a*roi*tennure)/100;
	System.out.println(amount1);
	return amount;
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
	public static void main(String[] args) {

	}

}
