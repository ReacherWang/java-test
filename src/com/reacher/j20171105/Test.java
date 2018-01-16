package com.reacher.j20171105;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by reacher on 17-11-5.
 */
public class Test {

    /**
     * 第一题
     * fn(1) = 1
     * fn(2) = 1;
     * fn(3) = 2;
     * fn(4) = 3;
     * fn(5) = 5;
     * fn(m) = fn(m - 1) + fn(m - 2)
     * <p>
     * 计算第m为10的结果:１、循环实现；２、递归实现
     * <p>
     * 第二题
     * 输入一个正整数，计算各个位的总和：１、循环实现；２、递归实现
     * <p>
     * 第三题
     * 角谷定理：输入一个自然数，若为偶数：除以２,若为奇数,则乘3加1
     * １、循环实现；２、递归实现(选作)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(sum(a));


    }

    private static int sum(int a) {
        if (0 == a / 10) {
            return a;
        }
        return a % 10 + sum(a / 10);
    }
}
