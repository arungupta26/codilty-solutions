package com.test.codility.lessons;

public class BinaryGap {

    public int solution(int N) {

        int maxGap = 0;
        boolean firstOne = true;
        int gap = 0;
        while (N != 0) {
            int bit = N % 2;
            if (bit == 0) {
                gap++;
            } else {
                if (firstOne) {
                    firstOne = false;
                } else {
                    maxGap = Math.max(maxGap, gap);
                }
                gap = 0;
            }
            N /= 2;
        }
        return maxGap;


    }

    public static void main(String[] args) {


        BinaryGap s = new BinaryGap();
        System.out.println(s.solution(1041));
    }
}
