package com.reacher.j20171022;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-22.
 */
public class ShuxianhuaNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please inout a number: ");

        int number = scanner.nextInt();

        int length = 1;

        int temp = number;
        while (0 != temp / 10) {
            ++length;
            temp /= 10;
        }

        temp = number;
        int huiwen = 0;
        while (0 != temp) {
            int by = temp % 10;
            huiwen += Math.pow(by, length);
            temp /= 10;
        }

        if (huiwen == number) {
            System.out.println(number + "是回文数字");
        } else {
            System.out.println(number + "不是回文数字");
        }

    }
}
