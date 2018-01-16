package com.reacher.j20171022;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-22.
 */
public class TwoTest {

    /**
     * 有两个正整数Ａ和Ｂ，判断Ｂ是否为Ａ的镜像
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please inout a number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Please inout a number2: ");
        int number2 = scanner.nextInt();

        int convert = 0;

        while (0 != number1) {
            int temp = number1 % 10;
            convert = convert * 10 + temp;
            number1 /= 10;
        }

        if (convert == number2) {
            System.out.println("互为镜像数据");
        } else {
            System.out.println("不是镜像数据");
        }

    }
}
