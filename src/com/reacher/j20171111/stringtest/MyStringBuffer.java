package com.reacher.j20171111.stringtest;

/**
 * Created by reacher on 17-11-11.
 */
public class MyStringBuffer {

    private String temp = "";

    public MyStringBuffer append(String str) {
        temp += str;

        return this;
    }

    @Override
    public String toString() {
        return temp;
    }
}
