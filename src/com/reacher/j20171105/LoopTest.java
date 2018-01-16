package com.reacher.j20171105;

/**
 * Created by reacher on 17-11-5.
 */
public class LoopTest {

    public static void main(String[] args) {
        System.out.println("Sum : " + sum(100));
    }

    /**
     *
     * 保护现场
     * 还原现场
     *
     * @param n
     * @return
     */
    private static int sum(int n) {
        if (0 != n %2) {
            n -= 1;
        }

        return n < 2 ? 0 : sum(n - 2) + n;
    }
}
