package com.reacher.j20171104;

/**
 * Created by reacher on 17-11-4.
 */
public class ArrayMove {

    public static void main(String[] args) {
        int[] array = new int[10];

        //第一步:Init
        init(array);

        //第二步:Move
        move(array);

        //第三步:Print
        print(array);
    }

    private static void init(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }
    }

    private static void move(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; --i) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
