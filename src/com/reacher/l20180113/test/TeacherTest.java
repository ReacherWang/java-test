package com.reacher.l20180113.test;

import com.reacher.l20180113.model.Teacher;
import com.reacher.l20180113.service.TeacherService;
import com.reacher.l20180113.service.impl.TeacherServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * Created by reacher on 18-1-13.
 */
public class TeacherTest {

    private static TeacherService teacherService = new TeacherServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("输入１创建老师");
            System.out.println("输入２查询老师列表");
            System.out.println("输入３根据姓名查询老师信息");
            System.out.println("输入4删除老师");
            System.out.println("输入5更新老师信息");
            System.out.println("输入0退出");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

            System.out.print("请输入您的操作: ");

            int operator = scanner.nextInt();
            if (0 == operator) {
                break;
            }
            if (1 == operator) {
                System.out.print("请输入老师名称:");
                String name = scanner.next();
                System.out.print("请输入老师登陆密码:");
                String password = scanner.next();

                Teacher teacher = new Teacher();
                teacher.setName(name);
                teacher.setPassword(password);

                teacherService.save(teacher);

                System.out.println("老师信息保存成功");
            }
            if (2 == operator) {
                List<Teacher> teachers = teacherService.list();

                for (Teacher temp: teachers) {
                    System.out.println(temp);
                }
            }
            if (3 == operator) {
                System.out.print("请输入老师名称:");
                String name = scanner.next();

                List<Teacher> teachers = teacherService.getByName(name);
                if (null == teachers || 0 == teachers.size()) {
                    System.out.println("当前查询的老师不存在");
                } else {
                    for (Teacher temp: teachers) {
                        System.out.println(temp);
                    }
                }
            }
            if (4 == operator) {
                System.out.print("请输入需要删除老师ID:");

                Long id = scanner.nextLong();

                teacherService.delete(id);
                System.out.println("老师信息删除成功");
            }
            if (5 == operator) {
                System.out.print("请输入需要更新老师ID:");

                Long id = scanner.nextLong();

                System.out.print("请输入老师名称:");
                String name = scanner.next();
                System.out.print("请输入老师登陆密码:");
                String password = scanner.next();

                Teacher teacher = new Teacher();
                teacher.setId(id);
                teacher.setName(name);
                teacher.setPassword(password);

                teacherService.update(teacher);
            }
        }

    }

}
