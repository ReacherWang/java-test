package com.reacher.j20171105.thread;

/**
 * Created by reacher on 17-11-5.
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        System.out.println("This is main");
    }

}
