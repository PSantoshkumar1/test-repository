package com.hashset;

public class P1 {
int i;
P1(){}
P1(int i)
{
	this.i=i;
	}


public String toString() {
	return "P1 [i=" + i + "]";
}
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + i;
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	P1 other = (P1) obj;
	if (i != other.i)
		return false;
	return true;
}

}
