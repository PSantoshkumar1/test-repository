//Refrigerator relation with temperature 
package com.assignment;

public class Refrigerator {
String colour;
Temperature temp=new Temperature(4.5);
int shelves;

Refrigerator()
{
	
}
Refrigerator(String colour,int shelves)
{
this.colour=colour;
this.shelves=shelves;
}
}
