package org.exploreandlearn.week2;

public class InversionCount {
    public int inversionCount(int arr[]) {
        return mergesort(arr);
    }

    private int mergesort(int[] arr) {
        int count = 0;
        if(arr.length < 2) return count;
        int mid = arr.length / 2;
        int[] left = splitArray(arr, 0, mid);
        int[] right = splitArray(arr, mid, arr.length);
        count += mergesort(left);
        count += mergesort(right);
        count += merger(arr, left, right);
        return  count;
    }

    private int[] splitArray(int[] arr, int left, int right) {
        int[] newArray = new int[right- left];
        System.arraycopy(arr, left, newArray, 0, newArray.length);
        return newArray;
    }

    private int merger(int[] arr, int[] left, int[] right) {
        int count = 0, i =0, j=0, k =0;
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                count += (left.length - i);
                arr[k] = right[j];
                j++; k++;
            }
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++; k++;
        }
        while(j < right.length) {
            arr[k] = right[j];
            j++; k++;
        }
        return count;
    }
}
