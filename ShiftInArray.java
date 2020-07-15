package com.itacademy;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class ShiftInArray {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arrayCircularShift(values);
        System.out.println(Arrays.toString(values));

        arrayCircularShift(values);
        System.out.println(Arrays.toString(values));

        arrayCircularShift(values);
        System.out.println(Arrays.toString(values));
    }

    public static void arrayCircularShift(int[] values) {
        int temp = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = temp;
    }

}
