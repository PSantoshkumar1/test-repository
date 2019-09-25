package com.hashmap;

import java.util.HashMap;

public class Hm2 {
public static void main(String[] args) {
	
	HashMap <Integer,String> hm=new HashMap();
	hm.put(1, "A");
	hm.put(2, "B");
	hm.put(2, "C");

	System.out.println(hm);
	//hm.put(10.0, "C"); //cte because generic doesnot allow heterogenous 
	//hm.put(2, "C");
	hm.put(2,"D");
	System.out.println(hm);
}

}
