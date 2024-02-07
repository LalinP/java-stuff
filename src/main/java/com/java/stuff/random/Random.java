package com.java.stuff.random;

public class Random {

  private static String [][] arr = new String[10][10];
  private static int columnsLength = arr[0].length;
  private static int rowsLength = arr.length;
  public static void main(String[] args) {
    reverseArray();
    for(int i=0; i< rowsLength; i++) {
      for(int j=0; j< columnsLength; j++){
        if(i == j){
          arr[i][j]= "****" ;
        }else {
          arr[i][j] = String.valueOf(i * j + i + j);
        }
      }
    }
    for(int i=0; i< rowsLength; i++) {
      System.out.println("printing row " + i);
      for(int j=0; j<columnsLength; j++){
        System.out.printf("  ");
        System.out.println(arr[i][j]);
      }
    }
  }

  private static void reverseArray() {
    int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
    int len = arr.length-1;
    int [] revArr = new int[arr.length];

    for(int i=0; i<= len; i++){
      revArr[i]= arr[len-i];
      System.out.println(arr[len-i]);
    }
  }

}
