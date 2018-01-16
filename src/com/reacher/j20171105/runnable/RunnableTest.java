package com.reacher.j20171105.runnable;

/**
 * Created by reacher on 17-11-5.
 */
public class RunnableTest {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("This is main");
    }
}
