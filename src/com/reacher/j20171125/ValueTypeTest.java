package com.reacher.j20171125;

/**
 * Created by reacher on 17-11-25.
 */
public class ValueTypeTest {

    public static void printValueType(Object value) {
        if (value instanceof Integer) {
            System.out.println("This is a int, value is " + value);
        } else if (value instanceof Short) {
            System.out.println("This is a short, value is " + value);
        } else if (value instanceof Long) {
            System.out.println("This is a long, value is " + value);
        } else if (value instanceof Float) {
            System.out.println("This is a float, value is " + value);
        } else {
            System.out.println("This is a string, value is " + value);
        }
    }
}
