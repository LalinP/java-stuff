package com.java.stuff.designpatterns.prototype;

/**
 * https://stackoverflow.com/questions/16329178/advantages-of-java-cloning
 * https://www.artima.com/articles/josh-bloch-on-design#part13
 */
public class PrototypeDemo {

  public static void main(String[] args) {
    Registry registry = new Registry();
    Movie clonedMovieOne = (Movie)registry.createClonedItem("Grinch");
    clonedMovieOne.setTitle("Oliver Twist");

    System.out.println(clonedMovieOne);
    System.out.println(clonedMovieOne.getTitle());
    System.out.println(clonedMovieOne.getRuntime());
    System.out.println(clonedMovieOne.getPrice());

    Movie clonedMovieTwo = (Movie)registry.createClonedItem("Grinch");
    clonedMovieTwo.setTitle("Shawshank Redemption");
    System.out.println(clonedMovieTwo);
    System.out.println(clonedMovieTwo.getTitle());
    System.out.println(clonedMovieTwo.getRuntime());
    System.out.println(clonedMovieTwo.getPrice());
  }
}
