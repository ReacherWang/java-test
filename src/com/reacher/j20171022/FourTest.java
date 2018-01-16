package com.reacher.j20171022;

/**
 * Created by reacher on 17-10-22.
 */
public class FourTest {

    /**
     * 取一个整数a从右端开始的4～7位
     * 等比数列 ===> sn = a1(1-q^n)/(1-q);
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1、a右移３位
         * ２、0000 0010  <===右移3位===== 0001 0011
         *    0000 1111  & <==> 2^3 + 2^2 + 2^1 + 2^0 <===等比数列==>2^n-1
         *    ------------
         *    0000 0010
         */

        int number = 19;//===>0001 0010

        int start = 4;
        int end = 7;

        int temp = (int)Math.pow(2, (end - start) + 1) - 1;

        number = (number >> (end - start)) & temp;

        System.out.println(number);
    }
}
