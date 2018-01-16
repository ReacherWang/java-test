package com.reacher.j20171126;

import java.util.*;

/**
 * Created by reacher on 17-11-26.
 */
public class ReacherTest {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("阿");
        list.add("啊");

        map.put("a", list);

        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
