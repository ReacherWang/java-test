package com.reacher.j20171122;

/**
 * Created by reacher on 17-11-22.
 */
public class Dog extends Animal{

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类非静态代码块");
    }

    public Dog(String color, String type) {
        super(color, type);
        System.out.println("子类构造器");
    }

    @Override
    public void sound() {
        System.out.println(this.getColor() + "的" + this.getType() + "发出汪汪的声音");
    }
}
