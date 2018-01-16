package com.java.base.controller;

import com.java.base.model.Department;
import com.java.base.service.DepartmentService;

import java.util.List;

/**
 * Created by reacher on 17-9-10.
 */
public class DepartmentController {

    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();

        String departmentName = "Dev Department";
        int userId = 1;

        departmentService.add(departmentName, userId);

        List<Department> departments = departmentService.findAll();
        for (Department department: departments) {
            System.out.println(department);
        }
    }
}
