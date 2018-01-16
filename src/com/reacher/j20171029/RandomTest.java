package com.reacher.j20171029;

import java.util.Random;

/**
 * Created by reacher on 17-10-29.
 */
public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(10));
        }
    }
}
