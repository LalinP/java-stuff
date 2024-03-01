package com.java.stuff.random.quicksort;

public class QuickSort {

  public void quickSort(int[] nums, int low, int high) {

    if(low < high){
      int partitionIndex = partitionIndex(nums, low, high);
      quickSort(nums, low, partitionIndex - 1);
      quickSort(nums, partitionIndex + 1, high);
    }
  }

  private int partitionIndex(int[]nums, int low, int high) {
    int i = low;
    int j = high;
    int pivot = nums[low];
    int temp = 0;

    while(i < j) {
      // find the first item in the array that's bigger than the pivot, on the left to the pivot
      while(nums[i] <= pivot && i <= high - 1){
        i++; // high-1 is because we do i++
      }
      // find the first item in the array that's smaller than the pivot, on the right side of the pivot
      while( nums[j] >= pivot && j >= low + 1){
        j--;
      }
      if(i < j) { // j hasn't yet crossed over beyond the pivot
        temp = nums[i]; // we have encountered a value that is bigger than pivot [i position]
        // and a value that's smaller than the pivot that's on the right side of the pivot, so we must move them across
        //to the other side respectively.
        nums[i] = nums[j];
        nums[j] = temp;
      }

    }
    //now, we swap, pivot with j so the pivot is now in the centre, between the lower numbers and higher numbers
    // Its now th time for the PIVOT to come to the correct place!
    temp = nums[j];
    nums[j] = nums[low];
    nums[low] = temp;

    return j;
  }
}
