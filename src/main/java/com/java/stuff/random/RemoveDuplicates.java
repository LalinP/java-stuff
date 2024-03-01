package com.java.stuff.random;


/**
 * Remove duplicates from the sorted array
 * Then return the number of unique elements in nums.
 */
public class RemoveDuplicates {

  public static int removeDuplicates(int[] nums) {
    int j=0;
    for(int i=1;i<nums.length;i++){
      if(nums[j]!=nums[i]){
        j++;
        nums[j]=nums[i];
      }
    }
    return j+1;
  }

  public static int remDuplicates(int[] nums) {
    int uniqueNumberPtr = 0;
    for(int i = 1; i<nums.length; i++){
      if(nums[uniqueNumberPtr] != nums[i]) {
        uniqueNumberPtr++;
        nums[uniqueNumberPtr] = nums[i];
      }
    }
    return uniqueNumberPtr++;
  }
  public static int countOdds(int[] nums){
    int uniqueOddsPtr = 0;
    for(int i=0; i < nums.length; i++){
      if(nums[i] % 2 != 0){
        nums[uniqueOddsPtr++] = nums[i];
      }
    }
    return uniqueOddsPtr;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{2,6,1,3,8,2,2,3,3,5}; // we want {0,1,2,3,4}
    int x = countOdds(nums);
    System.out.println(x);
  }
}

