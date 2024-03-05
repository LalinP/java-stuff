package com.java.stuff.random;

import static java.lang.Math.abs;

public class GameOfLife {
  public static void main(String[] args) {
    int[][] b = {{0,1,0},{0,0,1}, {1,1,1}, {0,0,0}};
    int col = b[0].length;
    int row = b.length;
    String[][] board = new String[row][col];



    buildBoard(board, b);
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

  public static void gameOfLife(String[][] board, int[][] data) {
    int lengthRows = board.length;
    int lengthColumns = board[0].length;
    System.out.println("rows " + lengthRows);
    System.out.println("columns " + lengthColumns);

    int[] dx = new int[]{0, 0, 1, 1, 1, -1, -1, -1};
    int[] dy = new int[]{1, -1, 1, -1, 0, 0, 1, -1};
    for (int r = 0; r < lengthRows; r++) {
      int counter = 0;
      for (int c = 0; c < lengthColumns; c++) {
        int currentX = r + dx[r];
        if (isValidNeighbour(r, c, board) && abs(Integer.parseInt(board[r][c])) == 1) {
          counter++;
        }
        if (board[r][c] == "1" && (counter < 2 || counter > 3)) {
          board[r][c] = "-1";
        }
        if (board[r][c] == "0" && (counter == 3)) {
          board[r][c] = "2";
        }
      }
    }
  }


    public static void buildBoard(String[][]board, int[][]data) {
      int lengthRows = board.length;
      int lengthColumns = board[0].length;
      System.out.println("rows "+ lengthRows);
      System.out.println("columns "+lengthColumns);

      int[] dx = new int[]{0,0,1,1,1,-1,-1,-1};
      int[] dy = new int[]{1,-1,1,-1,0,0,1,-1};

      for(int r=0; r<lengthRows; r++){
        for(int c=0; c<lengthColumns; c++){
          //if(c==0)board[r][c]= r;
          //else if(r==0) board[r][c]= c;
          //else if(Math.abs(row-r) == Math.abs(column-c)) board[r][c]="1";
          board[r][c]=String.valueOf(data[r][c]);
        }
      }



   /* int rowStart = row==0?0:row-1;
    int colStart = column==0?0:column-1;
    for(int r=rowStart; r<=row+1; r++){
      for(int c=colStart; c<=column+1; c++){
        if(r==row && c == column)board[r][c]=1;
        else if(Math.abs(row-r) == Math.abs(column-c)) board[r][c]=0;
        else board[r][c]=1;
      }
    }*/
  }

  private static boolean isValidNeighbour(int x, int y, String[][] board){
    return (x >=0 && x< board.length && y >= 0 && y <= board[0].length );
  }
}
