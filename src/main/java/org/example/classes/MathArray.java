package org.example.classes;

public class MathArray {
    public static int[] oddsToArray(int num) {
        int[] result = new int[0];
        int[] nextArray = new int[0];

        if (num <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    nextArray = new int[result.length + 1];
                    System.arraycopy(result, 0, nextArray, 0, result.length);
                    nextArray[result.length] = i;
                }
                result = nextArray;
            }

        }

        return result;

    }
}
