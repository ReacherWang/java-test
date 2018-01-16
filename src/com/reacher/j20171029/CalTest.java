package com.reacher.j20171029;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-29.
 */
public class CalTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int a = scanner.nextInt();
        System.out.print("Please input a number: ");
        int b = scanner.nextInt();

        System.out.print("Please input op: ");
        String op = scanner.next();

        Integer temp = null;

        if ("+".equals(op)) {
            temp = a + b;
        } else if ("-".equals(op)) {
            temp = a - b;
        } else if ("*".equals(op)) {
            temp = a * b;
        } else if ("/".equals(op)) {
            temp = a / b;
        } else if ("%".equals(op)) {
            temp = a % b;
        } else {
            System.out.println("OP error!");
            return;
        }
        System.out.println(a + " " + op + " " + b + " = " + temp);
    }
}
