package com.java.stuff.random;

/**
 * Leetcode - Level.EASY
 * there are two SORED arrays (in ascending order)
 * The task is to merge them but the combined array must be sorted in the same order as
 * the two individual arrays
 * The approach
 * Both arrays are sorted, so the last item in num1 is compared with last
 * item in num2
 *
 */
public class SortArrays {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int pMerge = m + n - 1;

    while (p2 >= 0) { // while we still have elements in nums2 start at the right end of the array and move left
      if (p1 >= 0 && nums1[p1] > nums2[p2]) {
        nums1[pMerge--] = nums1[p1--]; // because the num2 last guy smaller than the num 1 last guy, so num1 last guy is the biggest of them all
      } else {
        nums1[pMerge--] = nums2[p2--];
      }
    }
  }

  public static void mergeArrays(int[] nums1, int m, int[] nums2, int n){
    // create three pointers to start at the end of the last element of each array
    int p1 = m-1; // last value of nums1
    int p2 = n-1; // last value of nums2
    int pMerge = m + n -1; //last position of the final merged array

    while (p2 >= 0) {
      if (p1 >= 0
          && nums1[p1] > nums2[p2]) { // nums1 last value is bigger than nums2's last value. So this is the biggest
        nums1[pMerge--] = nums1[p1--]; // nums 2 value is bigger, so place nums2 curret value in nums1
      } else {
        nums1[pMerge--] = nums2[p2--];
      }
    }
  }

  public static void main(String[] args) {
    //int[] myIntArray = new int[]{1, 2, 3};
    int[] nums1 = new int[]{1,2,3,0,0,0};
    int[] nums2 = new int[]{2,5,6};

    merge(nums1, 3, nums2, 3);
    int x = nums1.length;
    for (int n = 0; n<x; n++) {
      System.out.println(nums1[n]);
    }
  }


}
