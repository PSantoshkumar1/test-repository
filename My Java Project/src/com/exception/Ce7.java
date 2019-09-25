package com.exception;

public class Ce7 {

	public static void main(String[] args)  throws ClassNotFoundException {
		System.out.println(1);
		Class.forName("java.util.Scanner");//if fqcn is wrong then exception will occur and is inhandeled
		System.out.println(2);

	}

}
