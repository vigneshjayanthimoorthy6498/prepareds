package org.exploreandlearn.week2;

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row : matrix) {
            if(binarySearch(row, target)) return true;
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int left = 0, right = matrix.length;
        while (left < right) {
            int mid =  (left + right) >> 1;
            if(matrix[mid] >= target) right = mid;
            else left = mid  + 1;
        }
        return matrix[left] == target;
    }

    public static void main(String[] args) {
        int[][] matrix =  {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        SearchIn2DMatrix searchIn2DMatrix = new SearchIn2DMatrix();
        System.out.println(searchIn2DMatrix.searchMatrix(matrix, 5));
    }
}
