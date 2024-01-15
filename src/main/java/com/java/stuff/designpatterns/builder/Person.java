package com.java.stuff.designpatterns.builder;

public class Person {
   private String name;
   private String age;
   private double salary;

   public static class NewBuilder {
     private String name;
     private String age;
     private double salary;

     public NewBuilder setName(String name) {
       this.name = name;
       return this;
     }

     public NewBuilder setAge(String age) {
       this.age = age;
       return this;
     }

     public NewBuilder setSalary(double salary) {
       this.salary = salary;
       return this;
     }

     public Person build() {
       return new Person(this); // The magic happens here
     }
   }

   public Person() {}

  public Person(NewBuilder newBuilder) {
     this.age = newBuilder.age;
     this.name = newBuilder.name;
     this.salary = newBuilder.salary;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return age;
  }

  public double getSalary() {
    return salary;
  }
}
