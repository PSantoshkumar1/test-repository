package com.arraylist;

import java.util.Comparator;

public class SortByRatting implements Comparator<Movie>{
	
public int compare(Movie movie1,Movie movie2)
{
	if(movie1.ratting>movie2.ratting)
		return 1;
	else if(movie1.ratting<movie2.ratting)
		return -1;
	else 
		return 0;
}
}
