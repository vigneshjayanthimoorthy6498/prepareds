package org.exploreandlearn.week2;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length -1;
        while (left < right ) {
            int mid  = (left + right) >> 1;
            if (nums[mid] > nums[mid + 1])  right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        FindPeakElement findPeakElement = new FindPeakElement();
        int peakElement = findPeakElement.findPeakElement(nums);
        System.out.println(peakElement);
    }
}
