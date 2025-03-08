package org.mryep.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aa {
    @SuppressWarnings({ "all" })
    public static void main(String[] args) {
        List<my> list = new ArrayList<>();

        list.add(new my(1, "a"));
        list.add(new my(2, "b"));
        list.add(new my(3, "c"));

        System.out.println(list);
        // !!想便利谁就得到谁的迭代器
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            // 返回下一个元素，类型是object，因为集合可以存放任何类型，或者可以写你已知你要存放的类型
            // my objmy = list.iterator().next(); 是对的，但是不利于代码维护
            Object obj = iterator.next();
            // 编译类型obj，运行类型取决于实际情况
            System.out.println(obj);

        }

        for(Object l : list ){
            System.out.println(l);
      }

    }

}

class my {
    private int age;
    private String name;

    public my() {
    };

    public my(int age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "my [age=" + age + ", name=" + name + "]";
    }

}
