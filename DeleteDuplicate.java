package com.itacademy;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */
public class DeleteDuplicate {

    public static void main(String[] args) {
        int[] values = {1, 4, 4, 8, 7, 7, 6, 3, 8};

        arrayDeleteDuplicate(values);
        System.out.println(Arrays.toString(values));
    }

    public static void arrayDeleteDuplicate(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
    }

}

