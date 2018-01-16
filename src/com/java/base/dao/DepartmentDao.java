package com.java.base.dao;

import com.java.base.model.Department;
import com.java.base.utils.SQLHelper;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public class DepartmentDao extends BaseDao<Department> {

    @Override
    protected String getTableName() {
        return "department";
    }

    @Override
    protected Class<Department> getMClass() {
        return Department.class;
    }

    /**
     * 添加部门
     * @param department
     */
    public void insert(Department department) {
        StringBuffer sql = new StringBuffer("insert into department (name, userId) values(");

        sql.append("\"" + department.getName() + "\"").append(",");
        sql.append("\"" + department.getUserId() + "\"").append(")");

        SQLHelper.insert(sql.toString());

    }

    /**
     * 更新部门(更新部门名称/经理)
     * @param department
     */
    public void update(Department department) {
        StringBuffer sql = new StringBuffer("update department set deleted = 0");
        if(null != department.getName() && 0 != department.getName().length()) {
            sql.append(", name = ").append("\"" + department.getName() + "\"");
        }
        if(0 <  department.getUserId()) {
            sql.append(", userId = ").append("\"" + department.getUserId() + "\"");
        }
        sql.append(" where id = ").append(department.getId());

        SQLHelper.update(sql.toString());
    }
}
