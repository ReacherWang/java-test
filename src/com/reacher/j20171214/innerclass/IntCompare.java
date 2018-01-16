package com.reacher.j20171214.innerclass;

/**
 * Created by reacher on 17-12-14.
 */
public class IntCompare implements Compare<Integer> {

    @Override
    public int compare(Integer value1, Integer value2) {
        return value1 - value2;
    }
}
