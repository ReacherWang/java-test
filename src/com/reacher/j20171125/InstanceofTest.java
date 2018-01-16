package com.reacher.j20171125;

/**
 * Created by reacher on 17-11-25.
 */
public class InstanceofTest {

    public static void printAnimalType(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("This is a dog");
        } else if (animal instanceof Fish) {
            System.out.println("This is a fish");
        } else if (animal instanceof Cat) {
            System.out.println("This is a cat");
        } else {
            System.out.println("un know");
        }
    }
}
