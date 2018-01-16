package com.reacher.j20171022;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-22.
 */
public class FiveTest {

    /**
     *       *
     *     * * *
     *   * * * * *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number: ");

        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {//控制三角形的高度
            for (int j = i; j < n - 1; ++j) {//控制每层左对齐需要填充的空格个数
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) + 1; ++k) {//控制每层*号的输出个数
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
