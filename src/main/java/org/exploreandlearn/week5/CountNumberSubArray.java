package org.exploreandlearn.week5;

public class CountNumberSubArray {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k ) - atMost(nums, k-1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0, right = 0, oddCount = 0, res  =0;
        for(; right < nums.length; right++) {
            if((nums[right] & 1) == 1) oddCount++;
            if(oddCount > k && left <= right) {
                if((nums[left] & 1) == 1) oddCount--;
                left++;
            }
            res += (right - left + 1);
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        CountNumberSubArray countNumberSubArray = new CountNumberSubArray();
        int i = countNumberSubArray.numberOfSubarrays(arr, 3);
        System.out.println(i);
    }
}
