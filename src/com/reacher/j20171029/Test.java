package com.reacher.j20171029;

/**
 * Created by reacher on 17-10-29.
 */
public class Test {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 26; ++i) {
            buffer.append((char)(97 + i));
        }

        System.out.println(buffer.toString());
    }
}
