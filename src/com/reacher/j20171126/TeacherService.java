package com.reacher.j20171126;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reacher on 17-11-26.
 */
public class TeacherService {

    private List<Teacher> teachers;

    public void insert(Teacher teacher) {
        if (this.teachers == null) {
            this.teachers = new ArrayList<>();
        }
        this.teachers.add(teacher);
    }

    public Teacher findByName(String name) {
        for (Teacher teacher: teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

}
