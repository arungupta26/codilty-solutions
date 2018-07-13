package com.test.codility.lessons;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A == null)
            return null;

        int arrayLength = A.length;

        int[] sol = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            sol[(i + K) % arrayLength] = A[i];
        }

        return sol;
    }


    public static void main(String[] args) {

        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] input = {3, 8, 9, 7, 6};

        int[] out = cyclicRotation.solution(input, 3);

        for(int i=0;i<out.length;i++)
        {
            System.out.print(out[i]+" ");
        }
    }
}
