package com.assignment;

public class Rider {

	public static void main(String[] args) {
		Vehicle v1;
		v1=new Vehicle();
		v1.name="BMW";
		v1.speed=220;
		v1.colour="BLUE";
		System.out.println("Vehicle name:"+v1.name+" speed:"+v1.speed+"Vehicle colour:"+v1.colour);
		
		
		
		Vehicle v2=new Vehicle();
		System.out.println("Vehicle name:"+v2.name+" id:"+v2.speed+"Vehicle colour:"+v2.colour);
		v2.name="Royal enfeild";
		v2.speed=150.0;
		v2.colour="RED";
		System.out.println("Vehicle name:"+v2.name+" id:"+v2.speed+"Vehicle colour:"+v2.colour);
		
		
		
		Vehicle v3=new Vehicle();
		v3.name="Harley Davidson";
		v3.speed=180.0;
		v3.colour="BlACK";
		System.out.println("Vehicle name:"+v3.name+" speed:"+v3.speed+"Vehicle colour:"+v3.colour);

	}
	

	}


