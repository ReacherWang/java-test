package com.reacher.j20171125.formater;

/**
 * Created by reacher on 17-11-25.
 */
public class IntegerFormat extends Format {

    @Override
    public Object format(String value) {
        if(value.contains(".")) {
            String[] temps = value.split("\\.");
            return new Integer(temps[0]);
        }
        return new Integer(value);
    }
}
