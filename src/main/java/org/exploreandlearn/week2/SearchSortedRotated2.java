package org.exploreandlearn.week2;

public class SearchSortedRotated2 {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while (left < right) {
            int mid = (left + right) >> 1;
            // this condition is used to find left side is sorted
            if(nums[mid] > nums[right]) {
                //this condition is whether the target belong to is present in left side
                if(nums[left] <=  target && target <= nums[mid]) {
                    right = mid;
                } else left = mid + 1;
            }
            // this condition is used to determine right side is sorted
            else if(nums[mid] < nums[right]) {

                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else right = mid;
            }
            // this is used to shrink the array , if the both mid and right are equals
            else right --;
        }
        return nums[left] == target;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        SearchSortedRotated2 searchSortedRotated2 = new SearchSortedRotated2();
        System.out.println(searchSortedRotated2.search(arr, 0));
    }
}
