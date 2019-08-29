package com.assignment;

import com.array3.Songs;

public class Parking {

		public static void display(Bikes[] park) {
			for(int i=0;i<park.length;i++)
			{
			System.out.println(park[i].brand);
			System.out.println(park[i].miliage);
			System.out.println(park[i].colour);
			System.out.println(" ");
			}
		}

		public static void main(String[] args) {
			Bikes[]park=new Bikes[5];
			park[0]=new Bikes("BULLET",35,"RED");
			park[1]=new Bikes("BULLET",35,"MARRON");
			park[2]=new Bikes("H.D",20,"BLACK");
			park[3]=new Bikes("JUPITER",35,"GREY");
			park[4]=new Bikes("HONDA",35,"WHITE");
			display(park);

	}

			
		}


