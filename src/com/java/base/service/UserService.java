package com.java.base.service;

import com.java.base.dao.UserDao;
import com.java.base.enums.UserTypeEnum;
import com.java.base.model.User;
import com.java.base.utils.MD5Util;

import java.util.List;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public class UserService {

    private UserDao userDao = new UserDao();

    public User login(String name, String password) {
        if (null == name || 0 == name.length()) {
            return null;
        }
        if (null == password || 0 == password.length()) {
            return null;
        }
        List<User> users = this.userDao.findList(name, MD5Util.md5(password));
        if(null == users || 0 == users.size()) {
            return null;
        }
        return users.get(0);
    }

    public boolean register(String name, String password, String address) {
        if (null == name || 0 == name.length()) {
            return false;
        }
        if (null == password || 0 == password.length()) {
            return false;
        }
        User user = new User();
        user.setName(name);
        user.setPassword(MD5Util.md5(password));
        user.setAddress(address);

        this.userDao.insert(user);

        return true;
    }

    public List<User> queryAll() {
        return this.userDao.findAll();
    }

    public void delete(Integer id) {
        this.userDao.deletedById(id);
    }

}
