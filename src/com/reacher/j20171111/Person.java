package com.reacher.j20171111;

/**
 * Created by reacher on 17-11-11.
 */
public class Person {

    private String name;
    private String sex;
    private int age;


    public Person() {
        this("reacher", "男", 28);
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person work() {
        System.out.println("姓名: " + name);
        System.out.println("性别: " + sex);
        System.out.println("年龄: " + age);

        return this;
    }

    public static void main(String[] args) {
        Person person1 = new Person();//new Person("杨颖", "女", 20);
        Person person2 = person1.work();

        System.out.println(person1 == person2);

    }
}
