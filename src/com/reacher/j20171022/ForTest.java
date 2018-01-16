package com.reacher.j20171022;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-22.
 */
public class ForTest {

    /**
     * 给一个不多于5位的正整数，要求：1、求它是几位数2、逆序打印出各位数字
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please inout a number: ");
        int number = scanner.nextInt();

        int length = 0;
        int convert = 0;

        while (0 != number) {
            int temp = number % 10;
            convert = convert * 10 + temp;
            length++;
            number /= 10;
        }

        System.out.println("长度为: " + length);
        System.out.println("逆序为: " + convert);
    }
}
