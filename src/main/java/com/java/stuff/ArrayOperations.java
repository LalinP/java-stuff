package com.java.stuff;

public class ArrayOperations {

  public static void main(String[] args) {
    String[][] board = new String[8][8];

  }

  public static void printBoard(String[][] board) {
    for (String[] row : board) {//for each row

      for (String element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
