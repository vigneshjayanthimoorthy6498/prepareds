package org.exploreandlearn.week2;

public class NthMagicalNumber {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod = 1_000_000_000 + 7;
        long left = Math.min(a, b), right =(long) Math.max(a, b) * n;
        int lcm = a * b /gcd(a, b);
        while (left < right) {
            long mid = (left+ right) >> 1;
            if(mid/ a + mid / b - mid /lcm >= n) right = mid;
            else left = mid + 1;
        }
        return(int) (left  % mod);
    }
    private int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if(a > b) a = a%b;
            else b = b%a;
        }
        return a == 0 ? b : a;
    }

    public static void main(String[] args) {
        NthMagicalNumber nthMagicalNumber = new NthMagicalNumber();
        System.out.println(nthMagicalNumber.nthMagicalNumber(4, 2, 3));
    }
}
