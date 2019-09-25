package com.treeset;

import java.util.TreeSet;

public class Ts1 {
public static void main(String[] args) {
	TreeSet ts =new TreeSet();
	ts.add(10);
	ts.add(90);
	ts.add(40);
	ts.add(4);
	System.out.println('a');//CCE 
	ts.add(null);//null pointer exception
	System.out.println(ts);
	ts.add(4); //duplicates not allowed
	ts.add(10.0); //cant add heterogenepous  type 
ts.add(true);
ts.add(10>=12);
ts.add(29); //CCE

}
}
