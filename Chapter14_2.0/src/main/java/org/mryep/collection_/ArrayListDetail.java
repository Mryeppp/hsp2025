package org.mryep.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 韩顺平
 * @version 1.0
 */
@SuppressWarnings({ "all" })
public class ArrayListDetail {
    public static void main(String[] args) {

        // 底层类似于vector;
        // 由数组存放数据;
        // ArrayList 是线程不安全的, 可以看源码 没有 synchronized
        // 所以多线程考虑vector
        /*
         * public boolean add(E e) {
         * ensureCapacityInternal(size + 1); // Increments modCount!!
         * elementData[size++] = e;
         * return true;
         * }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("hsp");
        System.out.println(arrayList);
    }
}
