package com.reacher.l20180113.util;

import java.util.Comparator;

/**
 * Created by reacher on 18-1-13.
 */
public final class SortUtil {

    public static <T> T[] sort(T[] datas, Comparator<T> comparator) {
        int size = datas.length;

        for (int i = 0; i < size - 1; ++i) {
            for (int j = 0; j < size - 1 - i; ++j) {
                if (comparator.compare(datas[j], datas[j + 1]) > 0) {
                    T temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }
        }

        return datas;
    }

}
