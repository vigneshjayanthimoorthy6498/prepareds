package org.exploreandlearn.week2;

import java.util.Arrays;

public class AggressiveCow {
    public static int aggressiveCows(int[] stalls, int k) {
       Arrays.sort(stalls);
       int left = 1, right = stalls[stalls.length -1] - stalls[0];
       while(left < right) {
           int mid = (left + right) >> 1;
           if(isPossible(stalls, k, mid)) {
               left = mid + 1;
           } else right = mid;
       }
       return  left;
    }

    private static boolean isPossible(int[] stalls, int cows, int distance) {
        int cow = 1, position = stalls[0];
        for(int pos = 1 ; pos < stalls.length; pos ++) {
            if(stalls[pos] - position >= distance) {
                cow++;
                position = stalls[pos];
                if (cow == cows) return true;
            }
        }
        return false;
    }

}
