package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BoxOffice {

	public static void main(String[] args) {
		Movie movie1=new Movie("Temper",10,2017);
		Movie movie2=new Movie("JANATHA GARAGE",9,2018);
		Movie movie3=new Movie("JAI LAVA KUSA",8,2018);
		Movie movie4=new Movie("NANAKU PREMATHO",7,2018);

		
		
		//System.out.println(movie1.compareTo(movie2));
		//System.out.println(movie2.compareTo(movie1));
		ArrayList<Movie> movien=new ArrayList();
		movien.add(movie1);
		movien.add(movie2);
		movien.add(movie3);
		movien.add(movie4);
		// before sorting 
		System.out.println("Before sortinng");
		//System.out.println(movien);
		for(Movie m:movien)
		{
			System.out.println("NAme is"+m.name);
			System.out.println("ratting is"+m.ratting);
			System.out.println("YOR is"+m.yor);
			System.out.println("||||||||||||||");
		}
		//after sorting
		System.out.println("After sorting");
		Collections.sort(movien);
		//System.out.println(movien);
		for(Movie m:movien)
		{
			System.out.println("NAme is"+m.name);
			System.out.println("ratting is"+m.ratting);
			System.out.println("YOR is"+m.yor);
			System.out.println("||||||||||||||");
		}
		System.out.println("***************************");
		
		SortByRatting S1 = new SortByRatting();
		System.out.println("Sorting by ratting");
		Collections.sort(movien ,new SortByRatting());
		for(Movie m:movien)
		{
			System.out.println("NAme is"+m.name);
			System.out.println("ratting is"+m.ratting);
			System.out.println("YOR is"+m.yor);
			System.out.println("||||||||||||||");
		}
		Collections.sort(movien ,new SortByName());
		for(Movie m:movien)
		{
			System.out.println("NAme is"+m.name);
			System.out.println("ratting is"+m.ratting);
			System.out.println("YOR is"+m.yor);
			System.out.println("||||||||||||||");
		}

		
		
		
		
		
	}
}
