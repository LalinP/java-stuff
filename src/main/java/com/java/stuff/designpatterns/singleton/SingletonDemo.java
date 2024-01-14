package com.java.stuff.designpatterns.singleton;

public class SingletonDemo {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton);
    Singleton anotherSingleton = Singleton.getInstance();
    System.out.println(anotherSingleton);
    if (singleton == anotherSingleton) {
      System.out.println("They are the same");
    }
  }

}
