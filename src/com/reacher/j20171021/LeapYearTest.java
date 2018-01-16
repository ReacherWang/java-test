package com.reacher.j20171021;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-21.
 */
public class LeapYearTest {

    /**
     * 第一个条件：能被400整除  =====> n % 400 == 0
     * 第二个条件：能被4整除，但是不能被100整除
     * 1 OR 2  ====> 是闰年
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a year: ");
        int year = scanner.nextInt();

        if(0 == year % 400 || 0 == year % 4 && 0 != year % 100) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
