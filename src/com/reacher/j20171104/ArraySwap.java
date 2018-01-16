package com.reacher.j20171104;

/**
 * Created by reacher on 17-11-4.
 */
public class ArraySwap {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }

        revert(array);

        for (int temp: array) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    private static void revert(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
