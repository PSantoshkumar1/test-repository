package com.abstraction2;

public class IciciAtm implements Atm {
	int balance;

	@Override
	public void depositing(int depositeAmount) {
balance =balance+depositeAmount;		
System.out.println("successfully deposited!!!{{{");
	}

	@Override
	public void withdrawing(int withdrawalAmount) {
if(withdrawalAmount<=balance)		
{
	balance=balance-withdrawalAmount;
}
else {
	System.out.println("insufficent balance please retry");
}
	}

	@Override
	public void checkBalance() {
System.out.println("Balance amount is "+balance);
	}
	

}
