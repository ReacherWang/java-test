package com.reacher.j20171125.formater;

/**
 * Created by reacher on 17-11-25.
 */
public abstract class Format {

    public abstract Object format(String value);

    public static Object format(String value, Format format) {
        return format.format(value);
    }
}
