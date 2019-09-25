package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hm1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "A");
		hm.put(2, "B");
		System.out.println(hm);
		hm.put(2, "C");
		System.out.println(hm);
		hm.put("D", 10.0);
		hm.put(null,"S");
		hm.put(4, 10.0);
		System.out.println(hm);
		Object ob=hm.get(2);
		System.out.println(ob);
		System.out.println(hm.remove(null));
		System.out.println(hm.containsKey(1));
		Set set =hm.keySet();
		System.out.println(set);
		
		Iterator t1=set.iterator();
		while(t1.hasNext())
		{
			Object key=t1.next();
			System.out.println(key);
			
		}
		System.out.println(hm.containsValue(10.0));
		Collection col=hm.values();
		System.out.println(col);
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}
}
