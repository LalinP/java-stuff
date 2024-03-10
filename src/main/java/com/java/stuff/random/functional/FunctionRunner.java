package com.java.stuff.random.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

import lombok.var;

public class FunctionRunner {

  public static void main(String[] args) {
  CalculateSum sumFunction = (x, y) -> x + y;
  var val = returnSum(sumFunction); // lambda allows to create the implementation for the method
    System.out.println(val);
    BiFunction<Integer, Integer, Integer> multiply = (x , y) -> x * y;
    var m = returnMultiply(3, 2 , multiply);
    System.out.println(m);
    System.out.println(subtract(3, v -> v -1));
  }
  public static int returnSum(CalculateSum sum){ // we passed the lambda impl
    return sum.calculateSum(2,3); //Call the method
  }
  public static int returnMultiply(int x, int y ,  BiFunction<Integer, Integer, Integer> multiplier) {
    return multiplier.apply(x,y);
  }
  public static int subtract(int x, Function<Integer, Integer> subtract) {
    return subtract.apply(x);
  }
}
