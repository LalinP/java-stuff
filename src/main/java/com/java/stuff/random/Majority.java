package com.java.stuff.random;

/**
 * use Boyer-Moore majority vote algorithm
 * linear time and constant space
 * start with candidate = num[0] and count = 1
 * Iterate to the next pos
 * if the count goes to zero, e must update the candidate to the NEW element
 *
 * if same as candidate, increment the counter - move to next
 * if NOT, decrement counter and assign the new value to candidate
 * space constant is linear - no extra initialisations
 */
//https://www.youtube.com/watch?v=gY-I8uQrCkk
public class Majority {

  public static int majorityElement(int[] nums) {
    int maj = nums.length/2;
    int candidate = 0;
    int count = 0;
    for(int element : nums) {
      if(count == 0) candidate = element;
      if(candidate == element) ++count;
      else --count;
    }
    return candidate;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{2,2,1,1,1,2,2};
    int maj = majorityElement(nums);
  }
}
