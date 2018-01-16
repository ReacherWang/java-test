package com.reacher.j20171022;

/**
 * Created by reacher on 17-10-22.
 */
public class FindMaxAndMinTest {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        int avg = (a + b + c) / 3;
        System.out.println("Max: " + max);

        System.out.println("Min: " + min);

        System.out.println("Avg: " + avg);
    }
}
