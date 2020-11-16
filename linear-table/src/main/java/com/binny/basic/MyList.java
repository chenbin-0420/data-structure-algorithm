package com.binny.basic;

/**
 * @author cb
 * @date 2020/9/3
 * description：
 */
public class MyList {
    private String[] array;
    private int index;
    private int length;

    /**
     * 初始化MyList
     * 初始化 index = -1 , length , array数组
     * @param length 数组长度
     */
    public MyList(int length) {
        this.index = -1;
        this.length = length;
        array = new String[length];
    }

    /**
     * MyList 数组长度
     * @return
     */
    public int size(){
        return index+1;
    }

    /**
     * 获取元素
     * @param index 数组索引
     * @return 数组元素
     */
    public String get(int index){
        if(index < 0 || index >= length){
            return "长度超长";
        }
        return array[index];
    }

    /**
     * 获取数组元素索引
     * @return 数组元素索引
     */
    public int index(String dataType){
        if(dataType == null){
            return -1;
        }
        for (int i = 0; i < length; i++) {
            if(array[i].equalsIgnoreCase(dataType)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 添加数组元素
     * @param index 数组索引
     * @param dataType 数组元素
     */
    public void add(int index,String dataType){
        if(dataType == null){
            throw new RuntimeException("数据类型值为空。");
        }
        if(this.index == length-1){
            throw new RuntimeException("表已满");
        }
        if(index<-1||index > length){
            throw new RuntimeException("index取值范围不合法");
        }
        // 新增索引在数组索引范围内
        if(index < this.index){
            // 1.将 i ... n 之间数据元素移动到 i+1 ... n+1中
            for (int i = this.index; i >= index; i--) {
                array[i+1] = array[i];
            }
            // 2.将index索引的数组添加dataType
            array[index] = dataType;
        } else {
            array[index] = dataType;
        }
        // 3.更新index
        this.index++;
    }

    /**
     * 指定索引移除数组元素
     * @param idx 数组索引
     */
    public void remove(int idx){
        if(idx < -1 || idx > length){
            throw new RuntimeException("需要移除的索引不合理");
        }
        // 1.数组移位
        for (int i = idx; i < this.index; i++) {
            array[i] = array[i+1];
        }
        // 2.数组索引减1
        index--;
    }

    /**
     * 遍历数组
     */
    public void each(){
        System.out.println("数据元素遍历：");
        for (int i = 0; i <= index; i++) {
            System.out.println(array[i]);
        }
    }
}
