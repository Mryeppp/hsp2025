package homework;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        // String对象之间使用equals确实是比较内容是否相同，
        // 但是Animal对象不是这样的
        // 由于自定义对象Animal没有重写equals方法，底层默认是比较ab是否为同一个对象，故错误
        System.out.println(a.name == b.name);
        String s4 = new String("hspedu");
        String s5 = "hspedu";

        System.out.println(s1 == s4);
        System.out.println(s4 == s5);

        String t1 = "hello" + s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern() == t2);

    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
