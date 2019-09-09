package com.abstraction2;

public class Tranaction {

	public static void main(String[] args) {
Atm atm=new IciciAtm();
atm.depositing(1000);
atm.checkBalance();
atm.withdrawing(500);
System.out.println("}}}}}}");
atm.checkBalance();
}

}
