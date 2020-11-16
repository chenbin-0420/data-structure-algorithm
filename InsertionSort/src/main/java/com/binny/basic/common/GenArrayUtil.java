package com.binny.basic.common;

import java.util.Random;

/**
 * @author cb
 * @date 2020/11/2
 * description：
 */
public class GenArrayUtil {
    /**
     * 生成插入数组
     * @param size 大小
     * @return 数组
     */
    public static Integer[] genInsertionArray(int size){
        Integer[] arrayList = new Integer[size];
        for (int i = 0; i < size; i++) {
            arrayList[i] = new Random().nextInt(size);
        }
        return arrayList;
    }
}
