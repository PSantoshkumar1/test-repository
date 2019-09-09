package com.polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		
P1.klRahul(); //from klrahul of p1
P2.klRahul();//fromm klrahul of p1
P1 ob1=new P1();
ob1.klRahul(); //from klrahul of p1
ob1.bulletPrakash(); //fro bullet  prakash in p2
P1 ob2=new P1();
ob2.klRahul(); //from klrahul of P1
ob2.bulletPrakash();//frombulletprakash in p1
P2 ob3=new P2();
ob3.klRahul();
ob3.bulletPrakash();


	}

}
