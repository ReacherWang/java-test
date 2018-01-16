package com.reacher.j20171105.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by reacher on 17-11-5.
 */
public class CallableTest {

    private static final int SIZE = 4;

    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();

        System.out.println("Sum: " + asyncSum());

        System.out.println("Used time: " + (System.currentTimeMillis() - startTime));


    }

    private static int syncSum() throws Exception {
        int sum = 0;

        for (int i = 1; i <= 100; ++i) {
            sum += i;
            TimeUnit.MILLISECONDS.sleep(100);
        }

        return sum;
    }

    private static int asyncSum() throws Exception {
        int sum = 0;

        ExecutorService threadPool = Executors.newFixedThreadPool(SIZE);
        Future<Integer>[] futures = new Future[SIZE];
        for (int i = 0; i < SIZE; ++i) {
            futures[i] = threadPool.submit(new SumCallable(i * (100 / SIZE) + 1, (i + 1) * (100 / SIZE)));
        }

        for (int i = 0; i < SIZE; ++i) {
            sum += futures[i].get();
        }

        threadPool.shutdown();

        return sum;
    }
}
