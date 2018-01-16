package com.java.base.dao;

import com.java.base.model.BaseModel;
import com.java.base.utils.SQLHelper;

import java.util.List;

/**
 * Created by reacher on 17-9-10.
 */
public abstract class BaseDao<M extends BaseModel> {

    protected abstract String getTableName();

    protected abstract Class<M> getMClass();

    public M findById(int id) {
        final String baseSql = "select * from " + this.getTableName() + " where deleted = 0 and id = " + id;

        List<M> result = SQLHelper.query(baseSql, this.getMClass());
        if (null == result || 0 == result.size()) {
            return null;
        }
        return result.get(0);
    }

    public List<M> findAll() {
        final String baseSql = "select * from " + this.getTableName() + " where deleted = 0";

        return SQLHelper.query(baseSql, this.getMClass());
    }

    public boolean deletedById(int id) {
        String sql = "update " + this.getTableName() + " set deleted = 1 where id = " + id;

        return SQLHelper.delete(sql);
    }

}
