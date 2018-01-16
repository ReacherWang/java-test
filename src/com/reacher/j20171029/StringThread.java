package com.reacher.j20171029;

/**
 * Created by reacher on 17-10-29.
 */
public class StringThread extends Thread {

    private StringBuilder builder;
    private Integer index;

    public StringThread(StringBuilder builder, Integer index) {
        this.builder = builder;
        this.index = index;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        builder.append((char)(65 + this.index));
    }
}
