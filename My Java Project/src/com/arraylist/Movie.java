package com.arraylist;

public class Movie implements Comparable<Movie>{
	String name;
	double ratting;
	double yor;//year of release
	
	Movie(){}
	Movie(String name,double ratting,double yor)
	{ 
		this.name=name;
		this.ratting=ratting;
		this.yor=yor;
	}
	
	public String toString() {
		return "Movie [name=" + name + ", ratting=" + ratting + ", yor=" + yor + "]";
	}
public int compareTo(Movie movie)
{
	if(this.yor>movie.yor)
		return 1;
	else if(this.yor<movie.yor)
	return -1;
	else 
		return 0;
	
	//return (int)(this.ratting-movie.ratting);
}


		
	}


