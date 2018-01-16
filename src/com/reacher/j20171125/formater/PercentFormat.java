package com.reacher.j20171125.formater;

/**
 * Created by reacher on 17-11-25.
 */
public class PercentFormat extends Format {

    @Override
    public Object format(String value) {
        Double temp = new Double(value);
        temp *= 100;
        return temp.toString() + "%";
    }
}
