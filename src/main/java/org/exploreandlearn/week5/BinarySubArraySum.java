package org.exploreandlearn.week5;

public class BinarySubArraySum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int withGoal = atMost(nums, goal);
        int withOneDown = atMost(nums, goal- 1);
        return withGoal - withOneDown;
    }
    private int atMost(int[] nums, int goal) {
        int left = 0 , right  =0, sum = 0, res = 0;
        for (; right< nums.length; right++) {
            sum += nums[right];
            while(sum > goal &&  left <= right) {
                sum -= nums[left];
                left++;
            }
            res += (right - left +1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        BinarySubArraySum bs = new BinarySubArraySum();
        System.out.println(bs.numSubarraysWithSum(arr, 2));
    }
}
