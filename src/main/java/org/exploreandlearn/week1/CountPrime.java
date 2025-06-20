package org.exploreandlearn.week1;

public class CountPrime {
    public int countPrimes(int n) {
       boolean[] resNumber = new boolean[n];
       int count = 0;
       for(int num = 2; num < n; num++) {
           if(!resNumber[num]) {
               count++;
               for(int inner = num *2 ; inner < n; inner +=num) {
                   resNumber[inner] = true;
               }
           }
       }
       return count;
    }

//    private boolean isPrime(int num) {
//        int count = 0;
//        for(int n = 1; n * n <= num; n++) {
//            if(num % n ==0 ) count++;
//        }
//        return count == 1;
//    }
}
