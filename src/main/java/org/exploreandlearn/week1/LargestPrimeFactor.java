package org.exploreandlearn.week1;

public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        int div = 2, max = 2;
        // this basic condition, where the given number is greater than 1
        while(n > 1) {
            if(n % div == 0) {
                n/=div;
                max = Math.max(max, div);
            }else div++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(5));
    }
}
