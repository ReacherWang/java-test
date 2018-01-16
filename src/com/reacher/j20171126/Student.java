package com.reacher.j20171126;

import java.util.List;
import java.util.Scanner;

/**
 * Created by reacher on 17-11-26.
 */
public class Student {

    private String name;
    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name is: " + this.name);
        System.out.println("Number is: " + this.number);
    }

    public static Student inoutInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input name: ");
        String name = scanner.next();
        System.out.print("Please input number: ");
        int number = scanner.nextInt();

        return new Student(name, number);
    }

    public static Student findByNum(int number, List<Student> students) {
        for (Student student: students) {
            if (number ==  student.getNumber()) {
                return student;
            }
        }
        return null;
    }

    public static boolean removeByNum(int numnber, List<Student> studentList) {
        Student student = findByNum(numnber, studentList);
        if (null == student) {
            return false;
        }
        return studentList.remove(student);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return student.getNumber() == this.number;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.number;
    }
}
