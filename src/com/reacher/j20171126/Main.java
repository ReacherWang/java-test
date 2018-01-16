package com.reacher.j20171126;

import java.util.*;

/**
 * Created by reacher on 17-11-26.
 */
public class Main {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        for (int i = 0; i < 3; ++i) {
            Student student = Student.inoutInfo();
            if(students.containsKey(student.getNumber())) {
                System.out.println("当前学号的学生已经存在，请重新输入");
                --i;
            } else {
                students.put(student.getNumber(), student);
            }
        }

        Iterator<Map.Entry<Integer, Student>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator.next();
            entry.getValue().printInfo();
        }
    }




}
