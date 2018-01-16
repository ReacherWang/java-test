package com.reacher.j20171021;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-21.
 */
public class SwitchCaseTest {

    /**
     * switch(表达式) {
     *     case "常量表达式１":
     *          表达式;
     *          break;(可有可无)
     *     case "常量表达式2":
     *          表达式;
     *          break;
     *          .
     *          .
     *          .
     *     default:
     *          表达式;
     * }
     *
     * 整型：byte short int(Byte Short Integer)
     * 字符：char(Character)
     * 字符串：String
     * 枚举：enum
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a level: ");
        String level = scanner.next();

        switch (level) {
            default:
                System.out.println("不合法数据");
                break;
            case "A":
                System.out.println("90 ~ 100");
                break;
            case "B":
                System.out.println("80 ~ 90");
                break;
            case "C":
                System.out.println("60 ~ 80");
                break;
            case "D":
                System.out.println("0 ~ 60");
                break;
        }
    }
}
