/*
 write a program to find prime of a given number 
 */
package com.numbertheory;

public class primenumber {

	public static void main(String[] args) {
int n=15; boolean isprime=true;
for(int i=2;i<n-1;i++)
{
	if(n%i==0)
	{
		isprime=false;
		break;
	}
}
if(isprime)
	System.out.println(n+"is prime number");
else
	System.out.println(n+"is not prime number");
	}

}
