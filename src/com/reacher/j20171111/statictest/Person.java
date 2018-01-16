package com.reacher.j20171111.statictest;

/**
 * Created by reacher on 17-11-11.
 */

/**
 *
 * 静态的方法　　可以调用　　　静态的方法
 * 静态的方法　　可以访问　　　静态的属性
 * 静态的方法　　不可以调用　　非静态的方法
 * 静态的方法　　不可以访问　　非静态的属性
 *
 * 非静态的方法　可以调用　　　非静态的方法
 * 非静态的方法　可以访问　　　非静态的属性
 * 非静态的方法　可以调用　　　静态的方法
 * 非静态的方法　可以访问　　　静态的属性
 *
 *
 *
 *
 */
public class Person {

    /**
     *
     * 1、静态自由块(只有在类第一次加载的时候被执行)
     * 2、非静态自由块
     * 3、构造器
     *
     */
    static {
        System.out.println("我是静态自由块");
    }

    {
        System.out.println("我是非静态自由块");
    }

    private static int age = 18;

    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("我是构造器");
    }

    public void info() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public void addAge(int value) {
        age += value;
    }

    public static void main(String[] args) {
        Person zhaoyu = new Person("zhaoyu");
        Person yangyin = new Person("yangyin");
        Person yangyin1 = new Person("yangyin1");
    }
}
