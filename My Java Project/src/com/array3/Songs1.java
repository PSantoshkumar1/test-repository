package com.array3;

public class Songs1 {
	public static void main(String[] args) {
 Songs[] s = {new Songs("teri",4.0,"rfak"),new Songs("abcd",4.3,"lkjh")};
 for(Songs s2:s)
 {
	 System.out.println("tittle:"+s2.tittle);
	 System.out.println("singer:"+s2.duration);
	 System.out.println("duration:"+s2.singer);
 }
	}

}
