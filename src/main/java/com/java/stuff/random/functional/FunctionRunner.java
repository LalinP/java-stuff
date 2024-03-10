package com.java.stuff.random.functional;

import lombok.var;

public class FunctionRunner {

  public static void main(String[] args) {
  CalculateSum sumFunction = (x, y) -> x + y;
  var val = returnSum(sumFunction); // lambda allows to create the implementation for the method
    System.out.println(val);
  }

  public static int returnSum(CalculateSum sum){ // we passed the lambda impl
    return sum.calculateSum(2,3); //Call the method
  }
}
