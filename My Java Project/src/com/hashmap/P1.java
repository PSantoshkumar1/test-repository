package com.hashmap;

public class P1 {
	int i ;
	private Object equals;
	P1(){}
	P1(int i)
	{
		this.i=i;
	
	}
	public String toString()
	{
		return "i";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		P1 other = (P1) obj;
		if (equals == null) {
			if (other.equals != null)
				return false;
		} else if (!equals.equals(other.equals))
			return false;
		if (i != other.i)
			return false;
		return true;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equals == null) ? 0 : equals.hashCode());
		result = prime * result + i;
		return result;
	}

}
