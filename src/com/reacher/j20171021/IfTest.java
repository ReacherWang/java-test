package com.reacher.j20171021;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-21.
 */
public class IfTest {

    /**
     * if -----> 如果
     * else----> 否则
     *
     * if(表达式)---->表达式的结果只能是　true | false
     *
     * 第一种用法: (推荐写法)
     * if(表达式) {
     *     //TODO.....
     * }
     *
     * if(表达式)  语句。。。
     *
     * if(表达式)
     *      语句。。。
     *
     * 第二种用法:
     * if(表达式) {
     *     //TODO.....
     * } else {
     *     //TODO.....
     * }
     *
     * 第三种用法:
     *if(表达式) {
     *     //TODO.....
     * } else if(表达式) {//else if 可以有多个
     *     //TODO.....
     * } else {
     *     //TODO.....
     * }
     *
     * 第四种用法:
     * if(表达式) {
     *     //TODO.....
     * }
     * if(表达式) {
     *     //TODO.....
     * } else {//和上面离它最近的if结合
     *     //TODO.....
     * }
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生姓名: ");
        String name = scanner.next();

        System.out.print("请输入学生年龄: ");
        int age = scanner.nextInt();

        System.out.print("请输入学生性别: ");
        String sex = scanner.next();

        if (18 <= age) {
            System.out.println(name + "已成年");
        } else {
            System.out.println(name + "未成年");
        }

        if ("男".equals(sex)) {
            System.out.println("这是一位小男生");
        } else {
            System.out.println("这是一位小女生");
        }
    }
}
