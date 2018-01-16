package com.reacher.l20171210;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by reacher on 17-12-10.
 */
public class HashTest {

    /**
     *
     * １、定义数组
     * 2、存放数据
     *      １、hash(value)===>key＝＝＝》数组下标
     *      ２、根据下标判断是否冲突
     *      3、如果不冲突将数据存放到下标对应的位置＝＝》结束
     *      4、如果冲突：key＋１作为value重复第一步
     *
     */

    private static final int SIZE = 5;

    public static void main(String[] args) {
        Integer[] datas = new Integer[SIZE];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < datas.length; ++i) {
            int value = scanner.nextInt();
            set(value, datas);
        }
        System.out.println(Arrays.asList(datas));

        System.out.print("请输入要查找的数据:　");
        int value = scanner.nextInt();
        int index = find(value, datas);
        if (-1 == index) {
            System.out.println("不存在");
        } else {
            System.out.println(String.format("该数据[%s]所在位置为:%s", value, index));
        }
    }

    public static void set(int value, Integer[] datas) {
        int key = hash(value);
        while (null != datas[key]) {
            key = hash(key + 1);//开放地址法
        }
        datas[key] = value;
    }

    public static int find(int value, Integer[] datas) {
        int key = hash(value);
        int count = datas.length;
        while (0 != count && datas[key] != value) {
            key = hash(key + 1);
            --count;
        }

        return 0 == count ? -1 : key;
    }

    public static int hash(int value) {
        return value % SIZE;
    }
}
