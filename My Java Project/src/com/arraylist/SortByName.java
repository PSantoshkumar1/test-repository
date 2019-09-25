package com.arraylist;

import java.util.Comparator;

public class SortByName implements Comparator<Movie>{
	
	
	public int compare(Movie movie1,Movie movie2)
	{
		return movie1.name.compareTo(movie2.name);
	}
	
}
