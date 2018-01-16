package com.reacher.j20171126;

/**
 * Created by reacher on 17-11-26.
 */
public class TeacherTest {

    private static TeacherService teacherService = new TeacherService();

    public static void main(String[] args) {
        String name = "K老师";
        String level = "教授";

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setLevel(level);

        teacherService.insert(teacher);

        teacher = teacherService.findByName("K老师");
        System.out.println(teacher);
    }
}
