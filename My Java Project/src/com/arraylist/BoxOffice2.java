package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BoxOffice2 {
	  public static void main(String[] args) 
	  {
          Scanner s=new Scanner(System.in);

          System.out.println("Press"+ "\n 1 to sort the movies by Ratings"

                                      + "\n 3 to sort the movies by Year Of Release");
          int choice1=s.nextInt();
          System.out.println("");
          System.out.println("Select the order in which you want to sort the Movies"
                                      +"\n Press 1 to sort in Ascending "
                                      +"\n Press 2 to sort in Descending");
          int choice2=s.nextInt();
          Movie m1=new Movie("Temper",10,2017);
  		Movie m2=new Movie("JANATHA GARAGE",9,2018);
  		Movie m3=new Movie("JAI LAVA KUSA",8,2018);
  		Movie m4=new Movie("NANAKU PREMATHO",7,2018);
          ArrayList<Movie>movie=new ArrayList<>();
          movie.add(m1);
          movie.add(m2);
          movie.add(m3);
          movie.add(m4);
//       System.out.println("***************Before sorting the movies*************");
//       System.out.println("");
//       //With the help of for each
//       for(Movie m:movie)
//       {
//                     System.out.println("name                     :"+m.name);
//                     System.out.println("rating                     :"+m.rating);
//                     System.out.println("releaseYear         :"+m.releaseYear);
//                     System.out.println("_______________________");
//       System.out.println("*******************After sortingas per ratings**********************");
//Collections.sort(movie);
//System.out.println(movie);
 //with the help of Iterator
 Iterator<Movie>t=movie.iterator();
//System.out.println("");
//System.out.println("******************Before  sorting as per ratings**********************");
//while(t.hasNext())
//{
//      Movie mov=t.next();
//      System.out.println("name                     :"+mov.name);
//                     System.out.println("rating                     :"+mov.rating);
//                     System.out.println("releaseYear         :"+mov.releaseYear);
//                     System.out.println("_______________________");
//                    
//}
//Collections.sort(movie);
//System.out.println(movie);
 //with the help of For loop
 System.out.println("");
 System.out.println("****************** Before  sorting **********************");
 for(int i=0;i<movie.size();i++)
 {
          System.out.println("name                     :"+movie.get(i).name);
                        System.out.println("rating                     :"+movie.get(i).ratting);
                        System.out.println("releaseYear         :"+movie.get(i).yor);
                        System.out.println("_______________________");
          }
if(choice2==1) {
             System.out.println("In Ascending Order");
             System.out.println("");
             System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_In Ascending Order-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
             System.out.println("");
 switch(choice1) {
 case 1:
 System.out.println("*******************After sorting as per ratings**********************");
 Collections.sort(movie);
 System.out.println(movie);
 break;
 case 2:
 System.out.println("*******************After Sorting the movies by Name**********************");
 Collections.sort(movie,new SortByName());
 System.out.println(movie);
 break;
 case 3:
 System.out.println("*******************After Sorting the movies by Year of Release**********************");
 Collections.sort(movie,new SortByYor());
 System.out.println(movie);
 break;
 default:
          System.out.println("Enter some valid input");
 }
}
else if(choice2==2)//
{
             System.out.println("");
             System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_In Descending Order-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
             System.out.println("");
             switch(choice1) {
              case 1:
              System.out.println("*******************After sorting as per ratings**********************");
              Collections.sort(movie);
              Collections.reverse(movie);
              System.out.println(movie);
              break;
              case 2:
              System.out.println("*******************After Sorting the movies by Name**********************");
              Collections.sort(movie,new SortByName());
              Collections.reverse(movie);
              System.out.println(movie);
              break;
              case 3:
              System.out.println("*******************After Sorting the movies by Year of Release**********************");
              Collections.sort(movie,new SortByYor());
              Collections.reverse(movie);
              System.out.println(movie);
              break;
              default:
                        System.out.println("Enter some valid input");
              }
}
             else
             {
                           System.out.println("Enter the valid choice");
             }
             }
}




