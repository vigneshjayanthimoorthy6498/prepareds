package org.exploreandlearn.week2;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums,target);
        int right = search(nums, target + 1);
        return left != right ? new int[]{left, right -1} : new int[]{-1, -1};
    }

    private int search(int[] nums, int target) {
        // initial left will be always 0 and right will be total length until we are not
        // going to use right position if we are going use them right value will be total length -1;
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = (left+ right) >> 1;
            if(nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
