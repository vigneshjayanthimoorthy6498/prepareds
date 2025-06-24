package org.exploreandlearn.week2;

public class KthMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int mid = (left + right) >> 1;
            int count = countNumber(m, n, mid);
            if(count >= k) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    private int  countNumber(int m, int n, int mid) {
        int count = 0;
        for(int row = 1; row <= m; row ++) {
            count += Math.min(mid/ row, n); // vvip
        }
        return  count;
    }

    public static void main(String[] args) {
        KthMultiplicationTable kthMultiplicationTable = new KthMultiplicationTable();
        System.out.println(kthMultiplicationTable.findKthNumber(2, 3, 6));
    }
}
