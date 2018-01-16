package com.reacher.j20170924;

import java.util.Scanner;

/**
 * Created by reacher on 17-9-24.
 */
public class User {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        String major = scanner.next();

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("专业：" + major);
    }
}
