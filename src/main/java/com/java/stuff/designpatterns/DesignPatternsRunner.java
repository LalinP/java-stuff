package com.java.stuff.designpatterns;

import lombok.var;

public class DesignPatternsRunner {

  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    System.out.println(runtime);

    Runtime anotherRunTime = Runtime.getRuntime();
    System.out.println(anotherRunTime);
    var result = runtime == anotherRunTime? "yes":"no";
    System.out.println("Both are the same ? " + result);
  }
}
