package com.binny.basic;

import com.binny.basic.common.GenArrayUtil;

/**
 * @author cb
 * @date 2020/11/2
 * description：
 */
public class ShellSort {

    public static void sort(Comparable[] arr){
        int two = 2;
        int j;
        // 外层控制小范围分段
        for (int gap = arr.length/two; gap > 0; gap /=two) {
            System.out.println("1 gap:"+gap);
            // 中间层遍历小范围分段元素
            for (int i = gap; i < arr.length; i++) {
                // 内层实现排序
                Comparable tmp = arr[i];
                for (j = i;j >= gap && tmp.compareTo(arr[j-gap]) < 0; j -= gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = GenArrayUtil.genInsertionArray(100);
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
        System.out.println();
        ShellSort.sort(array);
        System.out.println();
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
    }
}
