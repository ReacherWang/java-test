package com.reacher.j20171029;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reacher on 17-10-29.
 */
public class StringTest {

    public static void main(String[] args) throws Exception {

        StringBuilder builder = new StringBuilder();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 26; ++i) {
            Thread thread = new StringThread(builder, i);
            threads.add(thread);
            thread.start();
        }

        for (int i = 0; i < 26; ++i) {
            threads.get(i).join();
        }
        System.out.println("Length: " + builder.length());
        System.out.println("Content: " + builder.toString());
    }
}
