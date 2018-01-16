package com.reacher.j20171125.formater;

import com.reacher.j20171125.ValueTypeTest;

/**
 * Created by reacher on 17-11-25.
 */
public class FormatTest {

    public static void main(String[] args) {

        Object value = Format.format("28.65", new IntegerFormat());

        ValueTypeTest.printValueType(value);
    }
}
