package com.java.stuff.random;

import java.util.PriorityQueue;

public class KthElementPriorityQ {

  public static int findKthLargestElement(int[]nums, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    for(int element: nums) {
      priorityQueue.add(element);
      int size = priorityQueue.size();
      if(priorityQueue.size() > k){
        priorityQueue.poll();
      }
    }
    return priorityQueue.peek();
  }

  public static void main(String[] args) {
    int[]nums = new int[]{4,6,2,5,7,9,1,3};
    System.out.println(findKthLargestElement(nums, 3));
  }
}
