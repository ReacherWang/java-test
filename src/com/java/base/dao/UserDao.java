package com.java.base.dao;

import com.java.base.model.User;
import com.java.base.utils.SQLHelper;

import java.util.List;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public class UserDao extends BaseDao<User> {

    @Override
    protected String getTableName() {
        return "user";
    }

    @Override
    protected Class<User> getMClass() {
        return User.class;
    }

    /**
     * 添加用户
     * @param user
     */
    public void insert(User user) {
        StringBuffer sql = new StringBuffer("insert into user (name, password, address) values(");

        sql.append("\"" + user.getName() + "\"").append(",");
        sql.append("\"" + user.getPassword() + "\"").append(",");
        sql.append("\"" + user.getAddress() + "\"").append(")");

        SQLHelper.insert(sql.toString());

    }

    /**
     * 更新用户(更新用户名/年龄)
     * @param user
     */
    public void update(User user) {
        StringBuffer sql = new StringBuffer("update user set deleted = 0");
        if(null != user.getName() && 0 != user.getName().length()) {
            sql.append(", name = ").append("\"" + user.getName() + "\"");
        }
        if(null != user.getPassword() && 0 != user.getPassword().length()) {
            sql.append(", password = ").append("\"" + user.getPassword() + "\"");
        }
        if(null != user.getAddress()) {
            sql.append(", address = ").append(user.getAddress());
        }
        sql.append(" where id = ").append(user.getId());

        SQLHelper.update(sql.toString());
    }

    /**
     * 根据条件查询
     * @param name
     * @param password
     */
    public List<User> findList(String name, String password) {
        final String baseSql = "select * from user where deleted = 0";
        StringBuffer sql = new StringBuffer(baseSql);
        if(null != name && 0 != name.length()) {
            sql.append(" and name = ").append("\"" + name + "\"");
        }
        if(null != password && 0 != password.length()) {
            sql.append(" and password = ").append("\"" + password + "\"");
        }

        return SQLHelper.query(sql.toString(), User.class);
    }

}
