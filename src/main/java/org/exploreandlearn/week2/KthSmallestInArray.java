package org.exploreandlearn.week2;

import java.util.Arrays;

public class KthSmallestInArray {
    public int findKthSmallest(int[] nums, int k) {
     //   Arrays.sort(nums);
        int left = Integer.MAX_VALUE, right = 0, res  =0 ;
        for (int n : nums) {
            left = Math.min(n , left);
            right = Math.max(n, right);
        }
        while(left < right) {
            int mid = (left + right) >> 1;
            int count = countNumber(nums, mid);
            if(count < k) left = mid + 1;
            else{
               right = mid;
            }
        }
        return left;
     }
    private int countNumber(int[] nums, int mid) {
        int count = 0;
        for(int n : nums) {
            if( n <= mid) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 5, 7, 19};
        KthSmallestInArray kthSmallestInArray = new KthSmallestInArray();
        System.out.println(kthSmallestInArray.findKthSmallest(nums, 5));
    }
}
