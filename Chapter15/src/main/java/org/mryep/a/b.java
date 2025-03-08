package org.mryep.a;

import java.util.*;

public class b {
    @SuppressWarnings({ "all" })
    public static void main(String[] args) {

        Vector v = new Vector();

        HashSet<Stu> stu = new HashSet<>();
        stu.add(new Stu("xiaoming", 18));
        stu.add(new Stu("xiaoling", 17));
        stu.add(new Stu("xiaoking", 17));
        for (Object obj1 : stu) {
            System.out.println(obj1);
        }
        for (Iterator<Stu> it1 = stu.iterator(); it1.hasNext();) {
            System.out.println(it1.next());
        }

        HashMap<String, Stu> hashmap = new HashMap<>();
        hashmap.put("xiaoli", new Stu("xiaoli", 14));
        hashmap.put("xiaomi", new Stu("xiaomi", 14));
        hashmap.put("xiaoki", new Stu("xiaoki", 14));

        Set<Map.Entry<String, Stu>> entries = hashmap.entrySet();
        Iterator<Map.Entry<String, Stu>> it2 = entries.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Stu> next = it2.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

        Set<String> keyset = hashmap.keySet();
        Iterator<String> it3 = keyset.iterator();
        while (it3.hasNext()) {
            Object key = it3.next();
            System.out.println(key + "-" + hashmap.get(key));
        }
    }
}

class Stu {
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stu [name=" + name + ", age=" + age + "]";
    }

}
/**
 * 不能对加入到集合的元素类型进行约束，不安全
 * 类型转换效率低
 */