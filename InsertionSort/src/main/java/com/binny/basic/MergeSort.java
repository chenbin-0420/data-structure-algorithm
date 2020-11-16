package com.binny.basic;

import com.binny.basic.common.GenArrayUtil;

import java.util.Arrays;

/**
 * @author cb
 * @date 2020/11/3
 * description：
 */
public class MergeSort {
    public static void main(String[] args) {
        Integer[] array = GenArrayUtil.genInsertionArray(10);
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
        sort(array);
        System.out.println();
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
    }

    // 将arr[left...mid]和arr[mid+1...right]两部分进行归并

    private static void merge(Comparable[] arr,int left,int mid,int right){
        Comparable[] aux = Arrays.copyOfRange(arr,left,right+1);
        //初始化，i指向左半部分的起始索引位置left;j指向右半部分起始索引位置mid+1
        int i = left,j = mid + 1;
        for (int k = left; k <= right; k++) {
            if(i > mid){
                // 如果左半部分元素已经处理完毕
                arr[k] = aux[j - 1];
                j++;
            } else if(j > right){
                // 如果又半部分已经处理完毕
                arr[k] = aux[i - 1];
                i++;
            } else if(aux[i-1].compareTo(aux[j-1]) < 0){
                // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i - 1];
                i++;
            } else {
                // 右半部分所指元素 > 左半部分所指元素
                arr[k] = aux[j - 1];
                j++;
            }
        }
    }

    private static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr,0,n-1);
    }

    /**
     * 递归使用归并排序，对arr[left...right]的范围进行排序
     * @param arr 数组
     * @param left 左索引
     * @param right 右索引
     */
    private static void sort(Comparable[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int mid = (left + right)/2;
        sort(arr, left, mid);
        sort(arr,mid+1, right);
        // 对于arr[mid] <= arr[mid+1]的情况，不进行merge
        // 对于近乎有序的数组非常有效，但是对于一般情况，有一定的性能损失
        if(arr[mid].compareTo(arr[mid + 1]) > 0){
            merge(arr,left,mid,right);
        }
    }
}
