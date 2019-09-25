package com.hashmap;

import java.util.HashMap;

public class Hm3 {

public static void main(String[] args) {
	HashMap<P1, String> hm =new HashMap();
	hm.put(new P1(10), "A");
	hm.put(new P1(20),"B");
System.out.println(hm);
hm.put(new P1(30),"C");
System.out.println(hm);

}
}
