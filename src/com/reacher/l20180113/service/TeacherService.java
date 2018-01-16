package com.reacher.l20180113.service;

import com.reacher.l20180113.model.Teacher;

import java.util.List;

/**
 * Created by reacher on 18-1-13.
 */
public interface TeacherService {

    void save(Teacher teacher);

    List<Teacher> list();

    Teacher getById(Long id);

    void update(Teacher teacher);

    void delete(Long id);

    List<Teacher> getByName(String name);

}
