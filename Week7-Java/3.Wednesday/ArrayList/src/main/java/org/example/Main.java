package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<String> favoriteMovies = new ArrayList<>();

      favoriteMovies.add("Halloween");
      favoriteMovies.add("Taken");
      favoriteMovies.add("Mind Hunters");

      System.out.println("Favorite movies: " + favoriteMovies);

      String secondMovie = favoriteMovies.get(1);
      System.out.println("Movie at index 1 is: " + secondMovie);

      favoriteMovies.remove("Mind Hunters");

      System.out.println("New Favorite Movies: " + favoriteMovies);

      favoriteMovies.add(1, "The Matrix");

      System.out.println("Favorite Movies: " + favoriteMovies);

      if(favoriteMovies.contains("The Matrix")){
          System.out.println("The Matrix is one of my favorite movies");
      }

      for(String movie : favoriteMovies){
          System.out.println(movie);
      }

        //instead of length, we use size
        System.out.println("I have this many favorite movies: " + favoriteMovies.size());

      List<Integer> numberList = new ArrayList<>();
      List<Double> doubleList = new ArrayList<>();
    }
}