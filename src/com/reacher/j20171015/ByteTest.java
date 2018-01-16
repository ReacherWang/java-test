package com.reacher.j20171015;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-15.
 */
public class ByteTest {

    /**
     *  1 | ? ===> 1
     *  0 | ? ===> ?
     *
     *  0 & ? ===> 0
     *  1 & ? ===> ?
     *
     *
     * 有一个正整数，１、将某位置１；２、将某位清０
     *
     * 5===> 0000 0101;==第二位置1==>0000 0111====>7
     * 5===> 0000 0101;==第三位清0==>0000 0001====>1
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = 5;

        //0000 0101 ===第二位置1===> 0000 0111
        //0000 0010 <============== 1 << (n - 1)
        //--------- |
        //0000 0111
        int temp = (1 << (n - 1)) | a;

        System.out.println("temp = " + temp);

        //0000 0101 ===第三位清0===> 0000 0001
        //1111 1011 <============== ~(1 << (n - 1))
        //--------- &
        //0000 0001

        int m = scanner.nextInt();

        temp = ~(1 << (m - 1)) & a;
        System.out.println("temp = " + temp);
    }
}
