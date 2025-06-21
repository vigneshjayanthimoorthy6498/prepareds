package org.exploreandlearn.week2;

public class KthSmallestInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int left = matrix[0][0], len = matrix.length;
        int right = matrix[len -1][len -1];
        while (left < right) {
            int mid = (left + right) >> 1;
            int count = countNumber(matrix, mid);
            if(count < k) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private int countNumber(int[][] matrix, int mid) {
        int length = matrix.length, row=  length - 1, col =  0, count = 0;
        while(row >= 0 && col < length ) {
            if(matrix[row][col] <= mid) {
                // important thing to remember
                count += (row + 1);
                col++;
            } else row--;
        }
        return count;
    }

    public static void main(String[] args) {
//        int[][] nums = {{1,5,9},{10,11,13},{12,13,15}};
        int[][] nums = {{1,2},{1,3}};
        KthSmallestInSortedMatrix kthSmallestInSortedMatrix = new KthSmallestInSortedMatrix();
        int i = kthSmallestInSortedMatrix.kthSmallest(nums, 2);
        System.out.println(i);
    }
}
