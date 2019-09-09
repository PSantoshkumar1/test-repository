package com.abstraction2;

public class Mainclass {

	public static void main(String[] args) {
		
	// In1 ob1 =new In1();// can't instantiate an interface  and interface  doesn't have constructor
		
		
		In1 ob2;//can create reference variable of an interface
		In1 ob3=new Imc();//Imc is concrete hence can be instantiated
		ob3.test();
		
		
	}
}

// WebDriver driver =new RemoteWebDriver();