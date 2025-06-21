package org.exploreandlearn.week2;

public class SearchSortedRotated {
    public int search(int[] nums, int target) {
         int left = 0, right = nums.length -1;
         while(left < right) {
             int mid = (left + right ) >> 1;
             if(nums[left] <= nums[mid]) {
                 if(nums[left] <= target && target <= nums[mid]) right = mid;
                 else left = mid + 1;
             } else  {
                 if(nums[mid] <= target && target < nums[right]) left = mid + 1;
                 else right = mid;
             }
         }
        return nums[left] == target ? left :  -1;
    }
}
