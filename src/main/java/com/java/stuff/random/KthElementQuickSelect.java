package com.java.stuff.random;

public class KthElementQuickSelect {

  public static int findKthLargestElementQuickSelect(int[] nums, int k) {
    int n = nums.length;
    int kIndex = n - k, left = 0, right = n - 1;

    while (left < right) {
      int pivot = partition(nums, left, right); // anything to the left of pivot is smaller than the Pivot,
      // anything to the right is larger than the pivot
      if (pivot == kIndex) break;
      else if(pivot < kIndex) left = pivot + 1;
      else right = pivot - 1;
      }
    return nums[kIndex];
  }

  private static int partition(int[]nums, int start, int pivot){
    int i = start, j = start;
    int temp;
    while (j < pivot) {
      if(nums[j] < nums[pivot]){
        // anytime j is < pivot
        //we increment i
        // then swap j index value and pivot
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
      ++j;
    }
    temp = nums[i];
    nums[i] = nums[pivot];
    nums[pivot] = temp;

    return i;
  }

  public static void main(String[] args) {
    int[]nums = new int[]{6,2,4,7,1,5};
    int x = findKthLargestElementQuickSelect(nums, 4);
    System.out.println(x);
  }
}
