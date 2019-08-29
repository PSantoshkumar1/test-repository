/*
 write a program to find a prime of given number
 */
package com.numbertheory;

class primenumber2 {

	public static void main(String[] args) {
int n=15;
int count=0;
for(int i=1;i<=n;i++)
{
	count++;
}
	
	if(count==2)
		System.out.println(n+"is prime");
	else
		System.out.println(n+"is not prime");

}
}
