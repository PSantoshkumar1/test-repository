package com.inheritence;

public class MainClass3 {

	public static void main(String[] args) {
		AA3 ob1=new AA3();
		System.out.println("i:"+ob1.i); //1000
		//System.out.println("j:"+ob1.j); //CTE
		//System.out.println("k:"+ob1.k); //CTE
		BB3 ob2=new BB3();
		System.out.println("i:"+ob2.i); //1000
		System.out.println("j:"+ob2.j); //2000
		//System.out.println("k:"+ob2.k); //CTE
		CC3 ob3=new CC3();
		System.out.println("i:"+ob3.i); //1000
		//System.out.println("j:"+ob3.j); //CTE
		System.out.println("k:"+ob3.k); //3000
			
	}

}
