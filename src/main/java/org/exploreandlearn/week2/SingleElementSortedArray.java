package org.exploreandlearn.week2;

public class SingleElementSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            int midOffset = mid % 2 == 0  ? mid + 1 : mid -1;
            if(nums[mid] != nums[midOffset]) right = mid;
            else left = mid + 1;
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums =  {1, 1, 2, 2, 3,3, 4};
        SingleElementSortedArray singleElementSortedArray = new SingleElementSortedArray();
        System.out.println(singleElementSortedArray.singleNonDuplicate(nums));
    }
}
