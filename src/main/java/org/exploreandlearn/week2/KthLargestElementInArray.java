package org.exploreandlearn.week2;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = 0;
        for(int n : nums) {
            left = Math.min(left, n);
            right = Math.max(right, n);
        }
        while (left < right) {
            int mid = (left + right ) >> 1;
            int count = countNumber(nums, mid);
            if(count >= k) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    private int countNumber(int[] nums, int mid) {
        int count = 0;
        for(int n : nums) {
            if(n > mid)  count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        KthLargestElementInArray kthLargestElementInArray = new KthLargestElementInArray();
        System.out.println(kthLargestElementInArray.findKthLargest(nums, 4));
    }
}
