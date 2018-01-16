package com.reacher.l20180113.service.impl;

import com.reacher.l20180113.model.Teacher;
import com.reacher.l20180113.service.TeacherService;
import com.reacher.l20180113.util.SortUtil;

import java.util.*;

/**
 * Created by reacher on 18-1-13.
 */
public class TeacherServiceImpl implements TeacherService {

    private static final List<Teacher> teachers = new ArrayList<>();

    private static final Map<Long, Teacher> idToTeacherCache = new HashMap<>();

    private static final Map<String, List<Teacher>> nameToTeacherCache = new HashMap<>();

    private static Long ID = 0L;

    @Override
    public void save(Teacher teacher) {

        teacher.setId(++ID);

        teachers.add(teacher);

        idToTeacherCache.put(teacher.getId(), teacher);

        List<Teacher> sameNameTeachers = nameToTeacherCache.get(teacher.getName());
        if (null == sameNameTeachers) {
            sameNameTeachers = new ArrayList<>();
            nameToTeacherCache.put(teacher.getName(), sameNameTeachers);
        }
        sameNameTeachers.add(teacher);
    }

    @Override
    public List<Teacher> list() {
        return Arrays.asList(SortUtil.sort(teachers.toArray(new Teacher[0]), new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }));
    }

    @Override
    public Teacher getById(Long id) {
        return idToTeacherCache.get(id);
    }

    @Override
    public void update(Teacher teacher) {
        Teacher temp = idToTeacherCache.get(teacher.getId());
        List<Teacher> teachers = nameToTeacherCache.get(temp.getName());
        teachers.remove(temp);

        temp.setName(teacher.getName());
        temp.setPassword(teacher.getPassword());

        teachers = nameToTeacherCache.get(temp.getName());
        if (null == teachers) {
            teachers = new ArrayList<>();
            nameToTeacherCache.put(temp.getName(), teachers);
        }
        teachers.add(temp);

    }

    @Override
    public void delete(Long id) {
        Teacher teacher = idToTeacherCache.get(id);
        if (null == teacher) {
            return;
        }

        teachers.remove(teacher);

        idToTeacherCache.remove(id);

        List<Teacher> teachers = nameToTeacherCache.get(teacher.getName());
        teachers.remove(teacher);
    }

    @Override
    public List<Teacher> getByName(String name) {
        return nameToTeacherCache.get(name);
    }
}
