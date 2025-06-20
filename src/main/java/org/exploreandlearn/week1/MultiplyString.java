package org.exploreandlearn.week1;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        // declaring int array with length combination of num1 and num2
        int[] result = new int[length1 + length2];
        for (int i= length1 -1; i >=0; i--) {
            for (int inner = length2 -1; inner >=0 ; inner--) {
                int multiplicationResult = (num1.charAt(i) - '0') * (num2.charAt(inner) - '0');
                // the array is traversing end  so actual position last position in first iteration
                // and carry is second last position which take overhead it will decrease one by one
                int actualPosition = i + inner + 1;
                int carryPosition = i + inner;
                int total = multiplicationResult + result[actualPosition];
                result[actualPosition] = total % 10;
                result[carryPosition] += total / 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int res : result) {
            // this condition is to avoid the prefix Zero or else it will be like 09 or 06 instead of 9 or 6
            if(!(stringBuilder.isEmpty() && res == 0)) stringBuilder.append(res);
        }
        String num = stringBuilder.toString();
        return num.isEmpty() ? "0" : num;
    }

    public static void main(String[] args) {
        MultiplyString multiplyString = new MultiplyString();
        String multiply = multiplyString.multiply("2", "3");
        System.out.println(multiply);
    }
}
