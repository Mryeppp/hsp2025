package org.mryep.a;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({ "all" })
public class ss {
    public static void main(String[] args) {
        // 模拟一个HashSet的底层 (HashMap 的底层结构)

        // 1. 创建一个数组，数组的类型是 __Node[]
        // 2. 有些人，直接把 __Node[] 数组称为 表
        // _Node[] table = new _Node[16];
        //
        // //3. 创建结点
        // _Node john = new _Node("john", null);
        //
        // table[2] = john;
        // _Node jack = new _Node("jack", null);
        // john.next = jack;// 将jack 结点挂载到john
        // _Node rose = new _Node("Rose", null);
        // jack.next = rose;// 将rose 结点挂载到jack
        //
        // _Node lucy = new _Node("lucy", null);
        // table[3] = lucy; // 把lucy 放到 table表的索引为3的位置.
        // System.out.println("table=" + table);

        /**
         * hashcode 不相同，可以添加。
         * hashcode 相同，内容不同。可以添加
         * hashcode 相同，内容相同。不可以添加
         */

        HashSet<Employee_> set = new HashSet<Employee_>();
        set.add(new Employee_(16, "xm"));
        set.add(new Employee_(16, "xm"));
        set.add(new Employee_(16, "xl"));
        // 原本：hashcode 不相同，可以添加。
        // 现在：重写hash值 快捷键alt+insert 重写equals()和hashcode()，使得hashcode相同，内容相同，故不可以添加
        System.out.println("set=" + set);

    }
}

class _Node { // 结点, 存储数据, 可以指向下一个结点，从而形成链表
    Object item; // 存放数据
    _Node next; // 指向下一个结点

    public _Node(Object item, _Node next) {
        this.item = item;
        this.next = next;
    }
}

class Employee_ {
    private int age;
    private String name;

    public Employee_(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee_{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee_ other = (Employee_) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}