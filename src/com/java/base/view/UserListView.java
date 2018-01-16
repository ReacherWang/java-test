package com.java.base.view;

import com.java.base.model.User;
import com.java.base.service.UserService;

import java.util.List;

/**
 * Created by reacher on 17-9-14.
 */
public class UserListView extends AbstractListView {

    @Override
    protected String[] getColumnNames() {
        return new String[] {
                "ID", "姓名", "密码", "地址"
        };
    }

    @Override
    protected Object[][] getDatas() {
        UserService userService = new UserService();
        List<User> users = userService.queryAll();
        if (null == users || 0 == users.size()) {
            return new Object[0][];
        }
        Object[][] results = new Object[users.size()][];
        for (int i = 0; i < users.size(); ++i) {
            Object[] result = new Object[] {
                users.get(i).getId(), users.get(i).getName(), users.get(i).getPassword(), users.get(0).getAddress()
            };
            results[i] = result;
        }
        return results;
    }

}
