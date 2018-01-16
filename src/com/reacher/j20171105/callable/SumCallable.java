package com.reacher.j20171105.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by reacher on 17-11-5.
 */
public class SumCallable implements Callable<Integer> {

    private int start;
    private int end;

    public SumCallable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            sum += i;
            TimeUnit.MILLISECONDS.sleep(100);
        }
        return sum;
    }
}
