package com.reacher.j20171111.stringtest;

/**
 * Created by reacher on 17-11-11.
 */
public class Main {

    public static void main(String[] args) {
        MyStringBuffer buffer = new MyStringBuffer().append("a").append("b").append("c");

        System.out.println(buffer);
    }
}
