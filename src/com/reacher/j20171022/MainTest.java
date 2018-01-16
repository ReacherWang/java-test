package com.reacher.j20171022;

/**
 * Created by reacher on 17-10-22.
 */
public class MainTest {

    public static void main(String[] args) {

        /**
         * 第一次:初始语句＋逻辑表达式
         * 后面每次:更新＋逻辑表达式
         *
         * 初始语句可以省略
         * 逻辑表达式可以省略
         * 更新可以省略
         * for里面的两个分号不能省略
         */
        int counter = 0;
        for (int i = 0; i < 10; ++i) {
            for (int k = 0; k < 10; ++k) {
                counter++;
                System.out.println("HELLO WORLD: " + (i * k));
            }
        }

        System.out.println(counter);
    }
}
