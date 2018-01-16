package com.reacher.j20171015;

/**
 * Created by reacher on 17-10-15.
 */
public class TypeTest {

    public static void main(String[] args) {
        int i = 10;

        int a = 2;
        int b = 5;

        a = a + b - (i--);
        b = a + b - (--i);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("i = " + i);

    }
}
