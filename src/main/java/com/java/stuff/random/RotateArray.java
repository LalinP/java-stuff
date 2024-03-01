package com.java.stuff.random;

/**
 * Given an integer array nums,
 * rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {

  public static void rotate(int[] nums, int k) {
    for (int i = 0; i < k; i++) { // zero to k-1 or 1 to k
      int max = nums.length - 1;
      int temp = nums[max];
      int turns = 0;
      while (turns <= nums.length - 1) {
        if (max == 0) {
          nums[max] = temp;
        } else{
          nums[max] = nums[max-1];
          max--;
        }
        turns++;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,4,5,6,7};
    rotate(nums, 3);
  }

}
