package org.exploreandlearn.week2;

import java.util.Arrays;

public class SegregationEvenOdd {
    public void segregateEvenOdd(int arr[]) {
        int[] newArray = new int[arr.length];
        int k = 0;
        Arrays.sort(arr);
        for (int ele : arr) {
            if (ele % 2 == 0) newArray[k++] = ele;
        }
        for(int ele : arr) {
            if(ele % 2 != 0) newArray[k++] = ele;
        }
        System.arraycopy(newArray, 0, arr, 0, arr.length);

        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int i = 0;
        for(int a : arr) {
            if( a % 2 == 0) {
                temp[i++] = a;
            }
        }
        for(int a  : arr) {
            if(a % 2 != 0) {
                temp[i++] = a;
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
