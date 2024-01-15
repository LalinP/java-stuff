package com.java.stuff.designpatterns.builder;

import com.java.stuff.designpatterns.builder.Person.NewBuilder;

public class BuilderDemo {

  public static void main(String[] args) {

    Person newPerson = new NewBuilder()
        .setAge("45")
        .setName("Lalin")
        .setSalary(100.56)
        .build();

    System.out.println(newPerson.getName());
  }

}
