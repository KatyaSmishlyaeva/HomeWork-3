package com.itacademy;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class ArrayMerger {

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};

        int[] resultValues = mergeTwoArray(values1, values2);
        System.out.println(Arrays.toString(resultValues));
    }

    public static int[] mergeTwoArray(int[] values1, int[] values2) {
        int[] row1 = values1;
        int[] row2 = values2;
        if (values1.length < values2.length) {
            row1 = values2;
            row2 = values1;
        }
        int[] valuesResult = new int[row1.length + row2.length];
        int newCurrent = 0;
        for (int i = 0; i < row1.length; i++) {
            if (i < row2.length) {
                valuesResult[newCurrent] = row1[i];
                valuesResult[newCurrent + 1] = row2[i];
                newCurrent += 2;
            } else {
                valuesResult[newCurrent] = row1[i];
                newCurrent++;
            }
        }
        return valuesResult;
    }

}



