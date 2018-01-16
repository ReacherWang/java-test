package com.reacher.j20171022;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-22.
 */
public class ThreeTest {

    /**
     * 输出9*9口诀
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1*1=1
         * 1*2=2 2*2=4
         * 1*3=3 2*3=6 3*3=9
         */

        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            }
            System.out.println();
        }

    }
}
