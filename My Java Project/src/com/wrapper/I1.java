package com.wrapper;

public class I1 {

	public static void main(String[] args) {
		String [] str =new String[3];
		str[0]="12";
		str[1]="hello";
		str[2]="10.2";
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println(str);
	}

}
