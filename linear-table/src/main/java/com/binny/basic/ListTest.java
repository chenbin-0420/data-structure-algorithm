package com.binny.basic;

/**
 * Hello world!
 *
 */
public class ListTest
{
    public static void main( String[] args )
    {
        MyList list = new MyList(10);
        int maxCount = 5;
        for (int i = 0; i < maxCount; i++) {
            list.add(i,"str"+i);
        }
        list.each();
        list.get(4);
        list.add(5,"add1");
        list.each();
        list.add(2,"add2");
        list.each();
        System.out.println("size:"+list.size());
        list.remove(2);
        System.out.println("size:"+list.size());
        list.each();
    }
}
