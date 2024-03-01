package com.java.stuff.random;

public class Chess {

  public static void main(String[] args) {
    String[][] board = new String[8][8];

    buildBoard(board, 2, 2);
    printBoard(board);
    //System.out.println(Arrays.deepToString(board));
    //System.out.println("moves for pawn "+ pawnOneMoveCount(2,2, board));
    //printBoard(board);
    //buildBoard(board, 5, 3);
    //System.out.println(bishopDiagonalCount(7,2, board));
    printBoard(board);
  }

  public static void printBoard(String[][] board) {
    for (String[] row : board) {//for each row

      for (String element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }

  //move one step in any direction
  public static int kingMove(int row, int column, String[][] board){
    if(row > 7 || column > 7 || row < 0 || column < 0)
      return 0;
    int numberOfMoves = 0;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if ((Math.abs(column - j) == 0 || Math.abs(column - j) == 1)
            && ((Math.abs(row - i) == 1 || Math.abs(row - i) == 0))) {
          board[i][j] = "K";
          numberOfMoves++;
        }
      }
    }
    return numberOfMoves;
  }

  //move horizontally or vertically
  public static int rookMove(int row, int column, String[][] board){
    if(row > 7 || column > 7 || row < 0 || column < 0)
      return 0;
    int numberOfMoves = 0;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if( column == j || row == i ) {
          board[i][j] ="R";
          numberOfMoves++;
        }
      }
    }
    return numberOfMoves;
  }
  public static int bishopDiagonalCount(int row, int column, String[][] board){
    if(row > 7 || column > 7 )
      return 0;
    int numberOfMoves = 0;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if( Math.abs(row-i) == Math.abs(column-j) ) {
          board[i][j] ="B";
           numberOfMoves++;
        }
      }
    }
    return numberOfMoves;
  }
  public static int pawnOneMoveCount(int row, int column, String[][] board){
    int moveX = row -1;
    int moveYDiagonalLeft = column-1; //(row-1, column-1)
    int moveYDiagonalRight = column + 1; //(row-1, column+1)
    int numberOfMoves = 0;

    if(row > 7 || column > 7 )
      return 0;
    if(row == 0) {
      return numberOfMoves;
    }
    for (int i = moveX; i <= row; i++) {
      for (int j = column - 1; j <= column + 1; j++) {
        if ((i == moveX && j == moveYDiagonalLeft && j >= 0) || (i == moveX && j == moveYDiagonalRight
            && j <= 7) || (i == moveX && j == column && i >= 0)) {
          board[i][j] = "£";
          numberOfMoves++;
        }
      }
    }
    return numberOfMoves;
  }

  public static void buildBoard( String[][] board, int xPos, int yPos){
    for (int row = 0; row < 8; row++) {
      for (int column = 0; column < 8; column++) {
        if(column ==0 ){
          board[row][column] = String.valueOf(row);
        }
        else if(row == xPos && column == yPos){
          board[row][column] = "*";
        }else {
          board[row][column] = "-";
        }
      }
    }
  }
}
