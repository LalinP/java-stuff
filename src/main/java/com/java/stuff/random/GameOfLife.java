package com.java.stuff.random;

public class GameOfLife {
  public static void main(String[] args) {
    String[][] board = new String[8][8];

    buildBoard(board, 3, 4);
    printBoard(board);
    //printBoard(board);
  }

  public static void printBoard(String[][] board) {
    for (String[] row : board) {//for each row

      for (String element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }

  public static void buildBoard(String[][]board, int x, int y) {
    int lengthRows = board.length;
    int lengthColumns = board[0].length;
    System.out.println("rows "+ lengthRows);
    System.out.println("columns "+lengthColumns);

    for(int r=x; r<=x+1; r++){
      for(int c=0; c<=lengthColumns-1; c++){

        if(c==0)board[r][c]= String.valueOf(r);
        else if(r==0) board[r][c]= String.valueOf(c);
        else board[r][c]="1";

        if(r ==x && c == y) board[r][c]= "*";
        if(Math.abs())
      }
    }
  }
}
