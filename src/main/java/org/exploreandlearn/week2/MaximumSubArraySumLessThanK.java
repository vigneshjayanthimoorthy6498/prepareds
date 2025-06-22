package org.exploreandlearn.week2;

public class MaximumSubArraySumLessThanK {
    public int maxSubarraySize(int[] arr, int k) {
        int left = 0, right=  0, sum = 0, res = Integer.MAX_VALUE;
        for(; right < arr.length; right++) {
            sum += arr[right];
            while(sum > k) {
                res = Math.min(res, right - left);
                sum -= arr[left];
                left++;
            }
        }
        return res == 0 ? -1 : res ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        MaximumSubArraySumLessThanK maximumSubArraySumLessThanK = new MaximumSubArraySumLessThanK();
        System.out.println(maximumSubArraySumLessThanK.maxSubarraySize(arr, 8));
    }
}
