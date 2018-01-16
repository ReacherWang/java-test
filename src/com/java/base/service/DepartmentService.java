package com.java.base.service;

import com.java.base.dao.DepartmentDao;
import com.java.base.dao.UserDao;
import com.java.base.model.Department;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reacher on 17-9-10.
 */
public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();
    private UserDao userDao = new UserDao();

    public void add(String name, int userId) {
        Department department = new Department();
        department.setName(name);
        department.setUserId(userId);

        departmentDao.insert(department);
    }

    public List<Department> findAll() {
        List<Department> departments = this.departmentDao.findAll();
        if (null == departments || 0 == departments.size()) {
            return new ArrayList<>();
        }
        for (Department department: departments) {
            department.setUser(this.userDao.findById(department.getUserId()));
        }
        return departments;
    }

}
