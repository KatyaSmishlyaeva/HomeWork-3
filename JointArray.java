package com.itacademy;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class JointArray {

    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3, 8, 9, 10, 11 },
                {4, 5, 6},
                {2, 3, 4, 5, 7}
        };

        int[] resultValues = linearize(values);
        System.out.println(Arrays.toString(resultValues));
    }

    public static int[] linearize(int[][] values) {
        int[] newValues = new int[arrayLength(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            for (int j = 0; j < ints.length; j++) {
                newValues[currentIndex] = ints[j];
                currentIndex++;
            }
        }
        return newValues;
    }

    public static int arrayLength(int[][] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            result += ints.length;
        }
        return result;
    }

}
