package com.binny.basic;

import com.binny.basic.common.GenArrayUtil;

/**
 * Hello world!
 *
 */
public class InsertionSort
{
    public static void main( String[] args )
    {
        // 冒泡排序
        bubblingSort();
        // 插入排序
        insertionSort();
    }

    /**
     * 交换
     * @param arr 数组
     * @param i 数组索引
     * @param j 数组索引
     */
    private static void swap(Integer[] arr,int i,int j){
        Integer t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * 冒泡排序
     */
    private static void bubblingSort(){
        System.out.println("bubblingSort");
        Integer[] array = GenArrayUtil.genInsertionArray(10);
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i].compareTo(array[j]) > 0 ){
                    swap(array,i,j);
                }
            }
        }
        System.out.println();
        for (Integer obj : array) {
            System.out.print(obj+" ");
        }
    }

    /**
     * 插入排序
     */
    private static void insertionSort(){
        Integer[] array1 = GenArrayUtil.genInsertionArray(10);
        System.out.println("insertionSort");
        for (Integer obj : array1) {
            System.out.print(obj+" ");
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array1[j].compareTo(array1[j-1]) > 0){
                    swap(array1,j,j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println();
        for (Integer obj : array1) {
            System.out.print(obj+" ");
        }
    }
}
