package com.java.stuff.random.quicksort;

public class QuickSortRunner {

  public static void main(String[] args) {
    int[]nums = new int[]{4,6,2,5,7,9,1,3};
    QuickSort sort = new QuickSort();
    sort.quickSort(nums, 0, 7);
    for(int element: nums){
      System.out.println(element);
    }
  }
}
