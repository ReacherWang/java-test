package com.reacher.j20171214.innerclass;

/**
 * Created by reacher on 17-12-14.
 */
public class Main {

    public static void main(String[] args) {
        String a = "asdb";
        String b = "asdf";

        if(new Compare<String>() {
            @Override
            public int compare(String value1, String value2) {
                return value1.length() - value2.length();
            }
        }.compare(a, b) > 0) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }
    }
}
