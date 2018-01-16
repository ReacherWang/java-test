package com.reacher.j20171111;

/**
 * Created by reacher on 17-11-11.
 */
public class Test {

    public static void main(String[] args) {
        Animal animal = new Fish();


        talk(animal);
    }

    private static void talk(Animal animal) {
        animal.talk();
    }
}
