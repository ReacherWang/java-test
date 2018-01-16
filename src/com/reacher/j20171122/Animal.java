package com.reacher.j20171122;

/**
 * Created by reacher on 17-11-22.
 */
public class Animal {

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类非静态代码块");
    }

    private String color;
    private String type;

    public Animal(String color, String type) {
        this.type = type;
        System.out.println("父类构造器");
    }

    /**
     * 发出声音
     */
    public void sound() {
        //this.color = "";
        System.out.println(this.color + "的" + this.type + "发出未知的声音");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
